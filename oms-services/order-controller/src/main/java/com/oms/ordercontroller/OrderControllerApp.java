package com.oms.ordercontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.autoconfigure.domain.EntityScan;





@SpringBootApplication
@ImportResource({"META-INF/rr/**/*.xml"})
@EntityScan(basePackages = { "com.oms.entity" })
public class OrderControllerApp {
	
	@GetMapping("/message")
	public String getMessage()
	{
		return "hey lets dockerize";
	}
    
	public static void main(String[] args)
    {
      SpringApplication.run(OrderControllerApp.class, args);
    }
}