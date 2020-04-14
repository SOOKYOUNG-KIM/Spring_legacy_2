package com.hani.spring_2.member;

public class MemberService {
	
	private MemberDAO memberDAO;

	
	public MemberService(MemberDAO memberDAO){
		this.memberDAO = memberDAO;
	}
	
	//1. Insert()
	public int memberAdd(MemberVO memberDTO) throws Exception{
		return memberDAO.memberAdd(memberDTO);
	}
	
	//2. Login()
	public MemberVO memberLogin(MemberVO memberDTO) throws Exception{
		return memberDAO.memberLogin(memberDTO);
	}
	
	//3. Delete()
	public int memberDel(String id) throws Exception{
		return memberDAO.memberDelete(id);
	}
	//4. Update()
	public int memberUpdate(MemberVO memberDTO) throws Exception{
		return memberDAO.memberUpdate(memberDTO);
	}
	

}
