<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <link rel="stylesheet" href="resources/css/nav.css">
    <link rel="stylesheet" href="resources/css/home.css">

  <!-- Navbar -->
    <nav id="navbar">
      <div class="navbar_logo">
        <a href="#" id="logo">우리 오늘 뭐해?</a>
      </div>
      <ul class="navbar__menu">
        <li class="navbar__menu__item active" data-link="#menu">검색</li>
        <li class="navbar__menu__item" data-link="#recommend">추천 코스</li>
        <li class="navbar__menu__item" data-link="#review">리뷰</li>
        <li class="navbar__menu__item"><a href="member/login">로그인</a></li>
        <!-- 로그인 페이지 안에 회원가입구현 -->
      </ul>
      <!-- navbar toggle -->
      <button class="navbar__toggle-btn">
        <i class="fas fa-bars"></i>
      </button>
    </nav>

