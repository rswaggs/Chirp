package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandingPageController {
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

}
