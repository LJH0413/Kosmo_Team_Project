package com.wdt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.wdt.model.MemberVO;
import com.wdt.service.MemberService;

@Controller
public class MemberController {
	
private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	private MemberService memberservice;
	
	//회원가입 페이지 이동
		@RequestMapping(value = "/join", method= RequestMethod.GET)
		public void joinGET() {
			logger.info("회원가입 페이지 진입");
		}
		
		//회원가입
		@RequestMapping(value = "/join", method= RequestMethod.POST)
		public String joinPOST(MemberVO member) throws Exception {
			
			logger.info("회원가입 페이지(join) 진입");
			
			//회원가입 서비스 실행
			memberservice.memberJoin(member);
			
			logger.info("회원가입 완료");

			return "redirect:/index";
		}
		

		//로그인 페이지 이동
		@RequestMapping(value = "/login", method = RequestMethod.GET)
		public String loginGET() {
			logger.info("로그인 페이지 진입");

			return "login";
		}
		
		//아이디 중복 검사
		@RequestMapping(value = "/memberIdChk", method=RequestMethod.POST)
		@ResponseBody
		public String memberIdChkPost(String M_EMAIL) throws Exception {
			logger.info("memberIdChk() 진입");
			
			int result = memberservice.idCheck(M_EMAIL);
			
			logger.info("결과값 = " + result);
			
			if(result != 0 ) {
				return "fail";
			} else {
				return "success";
			}
		}
		
		//로그인
		@RequestMapping(value="login", method=RequestMethod.POST)
		public String loginPost(HttpServletRequest request, MemberVO member, RedirectAttributes rttr) throws Exception {
			
			System.out.println("login 매서드 진입");
			System.out.println("전달된 데이터 : " + member);
			
			HttpSession session = request.getSession();
			MemberVO lvo = memberservice.memberLogin(member);
			
			if(lvo == null) {
				int result = 0;
				rttr.addFlashAttribute("result", result);
				return "redirect:/login";
			}
			
			session.setAttribute("member", lvo);
			
			return "redirect:/index";
		}

}
