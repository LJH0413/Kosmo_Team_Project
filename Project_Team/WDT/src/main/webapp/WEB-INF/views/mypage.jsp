<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mypage</title>
<link rel="stylesheet" href="resources/css/nav.css" type="text/css">
<link rel="stylesheet" href="resources/css/mypage.css" type="text/css">
<link rel="stylesheet" href="resources/css/footer.css" type="text/css">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>

</head>
<body>

	<header>
		<%@include file="/WEB-INF/nav.jsp"%>
	</header>
	<center>
		<div class="my_title">
			<h1>MY PAGES</h1>
		</div>

		<div class="mypage_menu">
			<div class="info">회원정보 수정</div>
			<div class="manage">일정 관리 / 내보내기</div>
			<div class="review">나의 리뷰</div>
			<div>회원 탈퇴</div>
		</div>

		<div class="content">
			<p>우리 오늘 모해?</>
		</div>
	</center>

	<footer>
		<%@include file="/WEB-INF/footer.jsp"%>
	</footer>

	<script type="text/javascript">
	// 홈화면 내렸을 때 메뉴 배경 변경
	$(document).ready(function () {
	  $(window).scroll(function () {
	    var scroll = $(window).scrollTop();
	    if (scroll > 1) {
	      $("#navbar").css("background", "white");
	    } else {
	      $("#navbar").css("background", "none");
	    }
	  });
	});
	
	$(".login_button").click(function(){
		$("#login_form").attr("action", "login");
		$("#login_form").submit();
	})
	</script>


</body>
</html>