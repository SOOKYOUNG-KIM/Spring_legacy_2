package com.hani.spring_2.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/member/**")
public class MemberController {
	
	private MemberService memberService;
	
	public MemberController() {
		memberService = new MemberService();
	}
	
	
	@RequestMapping(value = "memberJoin")
	public void memberJoin(Model model) {	//model : response가 나가면 사라지는애들 
		String id = "test";
	    //model.addAttribute("id", "test");
		model.addAttribute(id);	//작동이 안되는 경우가 많음
	}
	
	@RequestMapping(value = "memberJoin", method = RequestMethod.POST)
	public String memberJoin2(MemberVO memberVO) {
		//MemberVO의 멤버변수의 값으로 파라미터 값 넣기
		//출력
		
		System.out.println(memberVO.getId());
		System.out.println(memberVO.getPw());
		System.out.println(memberVO.getName());
		System.out.println(memberVO.getAge());
		System.out.println(memberVO.getPhone());
		System.out.println(memberVO.getEmail());
		
		return "redirect:../";
	}
	
	@RequestMapping(value = "memberLogin")
	public void memberLogin() {
		
	}
	
	@RequestMapping(value = "memberLogin", method = RequestMethod.POST)
	public String memberLogin2(HttpSession session, MemberVO memberVO)throws Exception {
		
		memberVO = memberService.memberLogin(memberVO);
		
		memberVO.setId(session.);
		memberVO.setPw(session.get));
		
		//로그인 성공이면 index페이지로 이동
		if(memberVO!=null) {
			return "redirect:../";
		}else {
		//로그인 실패하면 로그인 실패 alert 후 login Form으로 이동
			session.setAttribute("result", "로그인 실패!");
			return "memberLogin";
			
		}
	}
	
	@RequestMapping(value = "memberPage")
	public void memberPage() {

	}
	
	@RequestMapping(value = "memberUpdate")
	public void memberUpdate() {
	}
	
	@RequestMapping(value = "memberUpdate", method = RequestMethod.POST)
	public void memberUpdate2() {
		System.out.println("Member Update Post");
	}
	
	

}
