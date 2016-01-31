package com.goodvideotutorials.spring.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.goodvideotutorials.spring.dto.SignInForm;
import com.goodvideotutorials.spring.dto.SignUpForm;
import com.goodvideotutorials.spring.mail.MailSender;
import com.goodvideotutorials.spring.mail.MockMailSender;

//@RestController //with this annotation we dont need to provide a response body
//the RestController annotation is good for making REST APIS

@Controller
public class RootController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(RootController.class);
	//@Resource
    private MailSender mailSender;
	
	@Autowired
	public RootController(@Qualifier("smtp")MailSender mailSender){
		this.mailSender = mailSender;
	}
	
	/*@RequestMapping("/")
	public String home(){
		
		mailSender.send("vibhatha@gmail.com", "test", "test");
		
		return "Hello, World";
	}*/
	@RequestMapping("/")
	public String home(){
		
		return "home";
	}
	
	
	
	@RequestMapping("/work")
	public String work(){
		
		return "work";
	}
	
	@RequestMapping("/right-sidebar")
	public String leftSidebar(){
		
		return "right-sidebar";
	}
	
	@RequestMapping("/left-sidebar")
	public String rightSidebar(){
		
		return "left-sidebar";
	}
	
	@RequestMapping("/no-sidebar")
	public String noSidebar(){
		
		return "no-sidebar";
	}
	
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET )
	public String signup(Model model){
		
		model.addAttribute(new SignUpForm());
		
		return "signup";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST )
	public String signup(@ModelAttribute("signUpForm") @Valid SignUpForm signUpForm, BindingResult result){
		
		if(result.hasErrors()){
			return "signup";
		}
		
		logger.info(signUpForm.toString());
		
		return "redirect:/";
	}
	
	
	@RequestMapping("/signin")
	public String signin(Model model){
		
		model.addAttribute(new SignInForm());
		
		return "signin";
	}
	
	
	

}
