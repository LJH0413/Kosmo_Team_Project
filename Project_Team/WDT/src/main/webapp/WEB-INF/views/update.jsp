<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>우리 오늘 모해?</title>
<link rel="stylesheet" href="resources/css/nav.css" type="text/css" />
<link rel="stylesheet" href="resources/css/join.css" type="text/css" />
<link rel="stylesheet" href="resources/css/footer.css" type="text/css" />
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>
	<header>
		<%@include file="/WEB-INF/nav.jsp"%>
	</header>



	<div class="join_wrapper">
		<div class="join_title">
			<span>회원정보 수정</span>
			<p>데이트 코스 추천 사이트 - 우리 오늘 모해?</p>
		</div>
		<form id="join_form" method="POST">
			<table>
				<tr style="padding-bottom:0;">
					<td>이메일</td>
					<td><input type="text" class="id_input" name="M_EMAIL" value="${member.getM_EMAIL()}" readonly="readonly"/></td>
				</tr>

				<tr>
					<td>비밀번호</td>
					<td><input id="pw" class="pw_input" type="password" name="M_PW" /></td>
				</tr>

				<tr>
					<td>비밀번호 확인</td>
					<td><input id="pwck" class="pwck_input" type="password" onchange="passConfirm()"  /></td>
				</tr>

				<tr>
					<td>이름</td>
					<td><input class="name_input" type="text" name="M_NAME" /></td>
				</tr>

				<tr>
					<td>전화번호</td>
					<td><input class="phone_input" type="text" name="M_PHONE" /></td>
				</tr>
				<tr>
					<td colspan="2"	style="text-align: center; border-bottom: none">
						<input class="join_button" type="submit" value="회원정보수정"/>
					</td>
				</tr>
			</table>
		</form>
	</div>

	<%@include file="/WEB-INF/footer.jsp"%>

<script src="resources/js/update.js">

</script>
	
</body>
</html>
