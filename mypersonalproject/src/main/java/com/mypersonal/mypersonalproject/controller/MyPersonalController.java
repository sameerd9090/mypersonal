package com.mypersonal.mypersonalproject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyPersonalController 
{
  @GetMapping("/mypersonal")
  public String showRespect()
  {
	  return "welcome";
  }
  
  @PostMapping("/mypersonal")
  public String showRespect0(HttpSession session,@RequestParam("firstname")String name, @RequestParam("lastname") String surname)
  {
	  session.setAttribute("name", name);
	  session.setAttribute("surname", surname);
	  return "hello";
  }
  
  @GetMapping("/mypersonal0")
  public String showRespect0()
  {
	  return "personal";
  }
}
