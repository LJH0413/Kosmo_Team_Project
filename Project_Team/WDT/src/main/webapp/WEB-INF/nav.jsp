<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!-- Navbar -->
<nav id="navbar">
	<div class="navbar_logo">
		<a href="index" id="logo">우리 오늘 뭐해?</a> <span style="color:grey; font-size: 2vh"> - 데이트 코스 추천 사이트</span>
	</div>
	<ul class="navbar__menu">
	<c:if test = "${member==null }">
		<li class="navbar__menu__item"><a href="login">로그인</a></li>
	</c:if>
	
	<c:if test = "${member!=null }">
		<li class="navbar__menu__item"><a href="logout.do">로그아웃</a></li>
	</c:if>
		
	</ul>
	<!-- navbar toggle -->
	<button class="navbar__toggle-btn">
		<i class="fas fa-bars"></i>
	</button>
</nav>


