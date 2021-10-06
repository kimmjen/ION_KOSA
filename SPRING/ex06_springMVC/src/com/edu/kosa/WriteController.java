package com.edu.kosa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WriteController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav = new ModelAndView();
		mav.addObject("page", "3 page");
		mav.addObject("title", "test01");
		mav.addObject("writer", "test01 작성자");
		
		mav.setViewName("board");
		
		return mav;
	}
	
	

}
