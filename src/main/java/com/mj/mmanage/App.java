package com.mj.mmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * Hello world!
 *
 */
@Controller
@EnableWebMvc
@SpringBootApplication
public class App  extends WebMvcConfigurerAdapter
{
	@RequestMapping("/")
	public String home(){
		return "redirect:login/toLogin";
		//return "index";
	}
	
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
