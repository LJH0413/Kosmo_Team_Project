"use strict";

//Navbar to toggle button for small screen
const navbarToggleBtn = document.querySelector(".navbar__toggle-btn");
navbarToggleBtn.addEventListener("click", () => {
  navbarMenu.classList.toggle("open");
});

// 네바 클릭시 이동
const navbarMenu = document.querySelector(".navbar__menu");
navbarMenu.addEventListener("click", (event) => {
  const target = event.target;
  const link = target.dataset.link;

  if (link == null) {
    return;
  }

  const scrollTo = document.querySelector(link);
  scrollTo.scrollIntoView({behavior:'smooth'});
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

