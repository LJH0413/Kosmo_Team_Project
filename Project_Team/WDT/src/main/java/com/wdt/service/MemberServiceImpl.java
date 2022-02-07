package com.wdt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdt.mapper.MemberMapper;
import com.wdt.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberMapper membermapper;
	
	@Override
	public void memberJoin(MemberVO member) throws Exception {
		membermapper.memberJoin(member);
	}
	
	@Override
	public int idCheck(String M_EMAIL) throws Exception{
		return membermapper.idCheck(M_EMAIL);
	}
	
	@Override
	public MemberVO memberLogin(MemberVO member) throws Exception {
		return membermapper.memberLogin(member);
	}

	@Override
	public void memberUpdate(MemberVO member) throws Exception {
		membermapper.memberUpdate(member);
	}

}
