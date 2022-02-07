package com.wdt.mapper;

import com.wdt.model.MemberVO;

public interface MemberMapper {

	//회원가입
	public void memberJoin(MemberVO member);
	
	//아이디 중복 검사
	public int idCheck(String M_EMAIL);
	
	//로그인
	public MemberVO memberLogin(MemberVO member);
	
	//회원정보수정
	public void memberUpdate(MemberVO member);
	
}
