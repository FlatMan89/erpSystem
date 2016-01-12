package com.zcyp.erpSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App 
{
	@RequestMapping("/")
	public String hello(){
		return "as大手大脚凯撒鹿鼎记萨阿萨德撒旦撒打算拉";
	}
	
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
