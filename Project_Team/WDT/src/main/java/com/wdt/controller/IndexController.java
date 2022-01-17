package com.wdt.controller;

//메인화면을 출력시켜주는 컨트롤러

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	//인덱스 페이지 이동
	@RequestMapping(value= "/index", method = RequestMethod.GET)
	public String indexPageGET() {
		logger.info("홈페이지 이동");
		
		return "index";
	}
	
	//회원가입 페이지 이동
		@RequestMapping(value = "/join", method = RequestMethod.GET)
		public String joinGET() {
			logger.info("회원가입 페이지 진입");
			
			return "join";
		}

		//로그인 페이지 이동
		@RequestMapping(value = "/login", method = RequestMethod.GET)
		public String loginGET() {
			logger.info("로그인 페이지 진입");
			
			return "login";
		}

}
