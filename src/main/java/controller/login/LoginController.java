package controller.login;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import entity.User;
import service.impl.LoginServiceImpl;
import service.login.LoginService;


@Controller
public class LoginController {
	@Autowired
	LoginServiceImpl loginservice;
	
	@RequestMapping(value="/loginvalidate",method=RequestMethod.POST)
	public String loginvalidate(User user,HttpSession session){
		
		User realuser=loginservice.login(user);
		if(realuser!=null)
		{
				
			session.setAttribute("username",realuser.getLoginname());
			session.setAttribute("userid", realuser.getUserid());
			
			
			return "index";
		}else
			return "fail";
	}
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession httpSession){
		httpSession.removeAttribute("username");
		return "login";
	}
	

  }
