package pl.deltacore.main.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainPageController {
	
    @RequestMapping("/")
    public String greeting() {
        
    	return "/main-page";
    } 
}  