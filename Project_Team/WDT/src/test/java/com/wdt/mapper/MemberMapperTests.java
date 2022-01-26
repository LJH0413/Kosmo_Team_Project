package com.wdt.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wdt.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTests {
	
	@Autowired
	private MemberMapper membermapper; //memberMapper.java 인터페이스 의존성 주입
	
//	//회원가입 쿼리 테스트 메서드
//	@Test
//	public void memberJoin() throws Exception {
//		MemberVO member = new MemberVO();
//		
//		member.setM_Email("test");
//		member.setM_PW("test");
//		member.setM_NAME("test");
//		member.setM_PHONE("test");
//		member.setM_BIRTH("1999.01.01");
//		member.setM_GENDER("man");
//		
//		membermapper.memberJoin(member);
//	}
	
//	//아이디 중복검사
//	@Test
//	public void memberIdChk() throws Exception {
//		String id1 = "edcdia2@naver.com";
//		String id2 = "admin";
//		membermapper.idCheck(id1);
//		membermapper.idCheck(id2);
//	}
	
	@Test
	public void memberLogin() throws Exception {
		MemberVO member = new MemberVO();
		
//		member.setM_Email("test");
//		member.setM_PW("test");
		
		member.setM_Email("aaa");
		member.setM_PW("aaa");
		
		membermapper.memberLogin(member);
		System.out.println("결과 값 : " + membermapper.memberLogin(member));
		
	}
	

}
