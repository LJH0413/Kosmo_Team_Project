	// 홈화면 내렸을 때 메뉴 배경 변경
		$(document).ready(function() {
			$(window).scroll(function() {
				var scroll = $(window).scrollTop();
				if (scroll > 1) {
					$("#navbar").css("background", "white");
				} else {
					$("#navbar").css("background", "none");
				}
			});
		});
		
/* 회원가입 유효성검사 통과유무 변수 */
		var mailCheck = false; //메일
		var mailchCheck = false; //메일 중복검사
		var pwCheck = false; //비밀번호
		var pwchCheck = false; //비밀번호 확인
		var pwckcorCheck = false; //비밀번호 확인 일치 확인
		var nameCheck = false; //이름
		var phoneCheck = false; //전화번호
		
		

		  //회원가입 버튼(회원가입 기능 작동)
	      $(document).ready(function() {
	        $(".join_button").click(function() {
	        	
	          var email = $(".id_input").val();
	          var pw = $(".pw_input").val();
	          var pwck = $(".pwck_input").val();
	          var name = $(".name_input").val();
	          var phone = $(".phone_input").val();

	          //이메일 유효성 검사
	          if ((email == "")) {
	            alert("이메일을 확인해주세요");
	            emailCheck = false;
	          } else {
	            emailCheck = true;
	          }

	          //비밀번호 유효성 검사
	          if ((pw == "")) {
	            alert("비밀번호를 확인해주세요");
	            pwCheck = false;
	          } else {
	            pwCheck = true;
	          }

	          //비밀번호 확인 유효성 검사
	          if ((pwck =="")) {
	            alert("비밀번호 확인을 확인해주세요");
	            pwchCheck = false;
	          } else {
	            pwchCheck = true;
	          }

	          //이름 유효성 검사
	          if ((name == "")) {
	            alert("이름을 확인 확인해주세요");
	            nameCheck = false;
	          } else {
	            nameCheck = true;
	          }

	          //핸드폰 유효성 검사
	          if ((phone == "")) {
	            alert("핸드폰을 확인 확인해주세요");
	            phoneCheck = false;
	          } else {
	            phoneCheck = true;
	          }

	          //최종 유효성 검사
	          if (pwCheck && pwchCheck && nameCheck && phoneCheck) {
	            $("#join_form").attr("action", "update");
	            $("#join_form").submit();
	          }
	          return false;
	        });
	      });

		//비밀번호 중복 검사
	      function passConfirm() {
	        var pw = document.getElementById("pw").value;
	        var pwch = document.getElementById("pwck").value;

	        if (pw != pwch) {
	          alert("비밀번호가 일치하지 않습니다");
	          return false;
	        } else {
	          return true;
	        }
	      }
