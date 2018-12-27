package ch.kosta.pbw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String start() {

		return "redirect:welcome";

	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome() {

		return null;

	}
	
}
