<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>login</title>
<link rel="stylesheet" href="resources/css/nav.css" type="text/css">
<link rel="stylesheet" href="resources/css/login.css" type="text/css">
<link rel="stylesheet" href="resources/css/footer.css" type="text/css">
<script src="resources/js/jquery-3.2.1.min.js"></script>
</head>
<body>
<header>
<%@include file="/WEB-INF/nav.jsp"%>
</header>


	<div class="login_wrapper">
		<div class="login_title">
			<span>LOG IN</span>
			<p>데이트 코스 추천 사이트 - 우리 오늘 모해?</p>
		</div>
		<form action="#">
			<table>
				<tr>
					<td style="border-bottom: none">Email</td>
				</tr>
				
				<tr>
				<td><input type="text"></td>
				</tr>

				<tr>
					<td style="border-bottom: none">비밀번호</td>
				</tr>
				
				<tr>
				<td><input type="password" /></td>
				</tr>
				
				<tr>
					<td colspan="2">개인 인증 </td>
					
				</tr>
				
					
				<tr>
					<td colspan="2"
						style="text-align: center; border-bottom: none; width:100%">
						<input class="login_submit" type="submit" value="로그인" />
					</td>
				</tr>
				
				<tr>
					<td colspan="2" style="border-bottom: none" class="join">회원이 아니세요?</td>
				</tr>
				
				<tr>
					<td colspan="2"  class="join"> <a href="join">회원가입</a></td>
				</tr>
				
				<!-- <tr>
					<td colspan="2">소셜로그인 영역</td>
				</tr> -->
			</table>
		</form>
	</div>
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
	</script>

</body>
</html>