package com.wdt.model;

public class MemberVO {
	
	
	private int M_ID; //회원 아이디
	private String M_Email; //회원 이메일
	private String M_PW; //회원 패스워드
	private String M_NAME; //회원 이름
	private String M_PHONE; //회원 전화번호
	private String M_BIRTH; //회원 생일
	private int M_REGDATE; //회원 등록일자
	private String M_GENDER; //회원 성별
	
	public int getM_ID() {
		return M_ID;
	}
	public void setM_ID(int m_ID) {
		M_ID = m_ID;
	}
	public String getM_Email() {
		return M_Email;
	}
	public void setM_Email(String m_Email) {
		M_Email = m_Email;
	}
	public String getM_PW() {
		return M_PW;
	}
	public void setM_PW(String m_PW) {
		M_PW = m_PW;
	}
	public String getM_NAME() {
		return M_NAME;
	}
	public void setM_NAME(String m_NAME) {
		M_NAME = m_NAME;
	}
	public String getM_PHONE() {
		return M_PHONE;
	}
	public void setM_PHONE(String m_PHONE) {
		M_PHONE = m_PHONE;
	}
	public String getM_BIRTH() {
		return M_BIRTH;
	}
	public void setM_BIRTH(String m_BIRTH) {
		M_BIRTH = m_BIRTH;
	}
	public int getM_REGDATE() {
		return M_REGDATE;
	}
	public void setM_REGDATE(int m_REGDATE) {
		M_REGDATE = m_REGDATE;
	}
	public String getM_GENDER() {
		return M_GENDER;
	}
	public void setM_GENDER(String m_GENDER) {
		M_GENDER = m_GENDER;
	}
	
	@Override
	public String toString() {
		return "MemberVO [memberId=" + M_ID + ", memberMail=" + M_Email + ", memberPw=" + M_PW + ", memberName=" + M_NAME
			+ ", MemberPhone=" + M_PHONE + ", memberRegDate=" + M_REGDATE + ", memberGender=" + M_GENDER + "]";
	}

}
