<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>우리 오늘 모해?</title>
<link rel="stylesheet" href="resources/css/nav.css" type="text/css"/>
<link rel="stylesheet" href="resources/css/join.css" type="text/css"/>
<link rel="stylesheet" href="resources/css/footer.css" type="text/css"/>
<script src="resources/js/jquery-3.2.1.min.js"></script>

</head>
<body>
<header>
<%@include file="/WEB-INF/nav.jsp"%>
</header>



	<div class="join_wrapper">
		<div class="join_title">
			<span>SIGN UP</span>
			<p>데이트 코스 추천 사이트 - 우리 오늘 모해?</p>
		</div>
		<form action="#">
			<table>
				<tr>
					<td>이메일:</td>
					<td><input type="text" style="width: 100px" /> @ <select>
							<option>선택</option>
							<option>naver.com</option>
							<option>google.com</option>
							<option>kakao.com</option>
							<option>daum.net</option>
							<option>nate.com</option>
					</select></td>
				</tr>

				<tr>
					<td>비밀번호:</td>
					<td><input type="password" /></td>
				</tr>

				<tr>
					<td>비밀번호 확인:</td>
					<td><input type="password" /></td>
				</tr>

				<tr>
					<td>이름:</td>
					<td><input type="text" /></td>
				</tr>

				<tr>
					<td>성별:</td>
					<td><input type="radio" name="info" checked /> 남성 <input
						type="radio" name="info" /> 여성</td>
				</tr>

				<tr>
					<td>전화번호:</td>
					<td><select>
							<option>010</option>
							<option>011</option>
							<option>012</option>
							<option>019</option>
					</select> - <input type="text" style="width: 60px" /> - <input type="text"
						style="width: 60px" /></td>
				</tr>
				<tr>
					<td colspan="2"
						style="text-align: center; width: 100%; border-bottom: none">
						<input class="join_submit" type="submit" value="회원 가입" />
					</td>
				</tr>
			</table>
		</form>
	</div>

	<%@include file="/WEB-INF/footer.jsp"%>
	
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
