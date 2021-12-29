"use strict";

//Navbar to toggle button for small screen
const navbarToggleBtn = document.querySelector(".navbar__toggle-btn");
navbarToggleBtn.addEventListener("click", () => {
  navbarMenu.classList.toggle("open");
});

// Handle scrolling when tapping on the navbar menu
const navbarMenu = document.querySelector(".navbar__menu");
navbarMenu.addEventListener("click", (event) => {
  const target = event.target;
  const link = target.dataset.link;
  if (link == null) {
    return;
  }
  navbarMenu.classList.remove("open");
  scrollIntoView(link);
});

//make home slowly fade to transperent as the window scrolls down
const home = document.querySelector("#home");
const homeHeight = home.getBoundingClientRect().height;
document.addEventListener("scroll", () => {
  home.style.opacity = 1 - window.scrollY / homeHeight;
});

// 홈화면 내렸을 때 메뉴 배경 변경
$(document).ready(function () {
  $(window).scroll(function () {
    var scroll = $(window).scrollTop();
    if (scroll > 1) {
      $("#navbar").css("background", "white");
      $("#logo").css("color", "#000000");
    } else {
      $("#navbar").css("background", "none");
      $("#logo").css("color", "white");
    }
  });
});

//Show "arrow up" button when scrolling down
const arrowUp = document.querySelector(".arrow__up");
document.addEventListener("scroll", () => {
  if (window.scrollY > homeHeight / 2) {
    arrowUp.classList.add("visible");
  } else {
    arrowUp.classList.remove("visible");
  }
});

//Handle click on "arrow Up"
arrowUp.addEventListener("click", () => {
  scrollIntoView("#home");
});

//Projects
const projectContainer = document.querySelector(".ottimo__desert");
const projects = document.querySelectorAll(".desert");
workBtnContainer.addEventListener("click", (e) => {
  const filter = e.target.dataset.filter || e.target.parentNode.dataset.filter;
  if (filter == null) {
    return;
  }

  //Remove Selection from the previuse item and select new item
  const active = document.querySelector(".desert__btn.selected");
  active.classList.remove("selected");
  const target =
    e.target.nodeName === "BUTTON" ? e.target : e.target.parentNode;
  target.classList.add("selected");

  projects.forEach((desert) => {
    if (filter === "*" || filter === desert.dataset.type) {
      desert.classList.remove("invisible");
    } else {
      desert.classList.add("invisible");
    }
  });
  projectContainer.classList.add("anim-out");
  setTimeout(() => {
    projectContainer.classList.remove("anim-out");
  }, 300);
});

function scrollIntoView(selector) {
  const scrollTo = document.querySelector(selector);
  scrollTo.scrollIntoView({ behavior: "smooth" });
}

//1.모든 섹션 요소들을 가지고 온다
//2. intersectionobserver를 이용 모든 섹션들을 관찰
//3. 보여지는 섹션에 해당되는 메뉴 아이템 활성화

const sectionIds = ["#menu", "#recommend", "#review"];
const navItems = sectionIds.map((id) =>
  document.querySelector(`[data-link="${id}"]`)
);
const secitons = sectionIds.map((id) => document.querySelector(id));

let selectedNavIndex = 0;
let selectedNavItem = navItems[0];
function selectNavItem(selected) {
  selectedNavItem.classList.remove("active");
  selectedNavItem = selected;
  selectedNavItem.classList.add("active");
}
const observerOptions = {
  root: null,
  rootMargin: "0px",
  threshold: 0.3,
};

const observerCallback = (entries, observer) => {
  entries.forEach((entry) => {
    if (!entry.isIntersecting && entry.intersectionRatio > 0) {
      const index = sectionIds.indexOf(`#${entry.target.id}`);
      let selectedIndex;
      if (entry.boundingClientRect.y < 0) {
        selectedIndex = index + 1;
      } else {
        selectedIndex = index - 1;
      }
    }
  });
};

const observer = new IntersectionObserver(observerCallback, observerOptions);
secitons.forEach((section) => observer.observe(section));
