package com.wdt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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

	@Autowired
	private BCryptPasswordEncoder pwEncoder;

	//회원가입 페이지 이동
	@RequestMapping(value = "/join", method= RequestMethod.GET)
	public void joinGET() {
		logger.info("회원가입 페이지 진입");
	}

	//회원가입
	@RequestMapping(value = "/join", method= RequestMethod.POST)
	public String joinPOST(MemberVO member) throws Exception {

		String rawPw = ""; //인코딩 전 비밀번호
		String encodePw = ""; //인코딩 후 비밀번호

		rawPw = member.getM_PW();
		encodePw = pwEncoder.encode(rawPw);
		member.setM_PW(encodePw);

		//회원가입 서비스 실행
		memberservice.memberJoin(member);

		//			logger.info("회원가입 페이지(join) 진입");
		//			logger.info("회원가입 완료");

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

		HttpSession session = request.getSession();
		String rawPw = "";
		String encodePw = "";

		MemberVO lvo = memberservice.memberLogin(member);

		if(lvo != null) { //일치하는 아이디 존재시

			rawPw = member.getM_PW();
			encodePw = lvo.getM_PW();

			if(true == pwEncoder.matches(rawPw, encodePw)) {
				lvo.setM_PW(""); //인코딩된 비밀번호 지움
				session.setAttribute("member", lvo); //세션에 사용자의 정보 저장
				return "redirect:/index"; //메인페이지 이동
			} else {
				rttr.addFlashAttribute("result", 0);
				return "redircet:/login";
			}

		} else {
			rttr.addFlashAttribute("result", 0);
			return "redirect:/login";
		}
	}

	//메인페이지 로그아웃
	@RequestMapping(value="logout.do", method = RequestMethod.GET) 
	public String logoutMainGET(HttpServletRequest request) throws Exception {

		logger.info("logout Main GET 매소드 진입");

		HttpSession session = request.getSession();

		session.invalidate();

		return "redirect:/index";

	}

	//마이페이지 이동
	@RequestMapping(value = "/mypage", method= RequestMethod.GET)
	public void mypageGET() throws Exception{
		
		logger.info("마이 페이지 진입");
		
	}

	@RequestMapping(value="/update", method = RequestMethod.GET)
	public void registerUpdateView() throws Exception{
		
		logger.info("회원가입 수정 페이지 진입");
	}

	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String registerUpdate(MemberVO vo, HttpSession session) throws Exception{
		
		String rawPw = ""; //인코딩 전 비밀번호
		String encodePw = ""; //인코딩 후 비밀번호

		rawPw = vo.getM_PW();
		encodePw = pwEncoder.encode(rawPw);
		vo.setM_PW(encodePw);

		
		memberservice.memberUpdate(vo);
		
		session.invalidate();
		
		return "redirect:/index";
	}

	
	

	


}
