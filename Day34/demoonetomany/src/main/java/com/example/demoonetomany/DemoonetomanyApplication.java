package com.example.demoonetomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoonetomanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoonetomanyApplication.class, args);
		ApplicationContext context;
		context=SpringApplication.run(DemoonetomanyApplication.class, args);
		
		CartRepository cart = context.getBean(CartRepository.class);
		ItemRepository item = context.getBean(ItemRepository.class);
		
		Cart c1= new Cart(1, "kalyani");
		cart.save(c1);
		
		Item i1 = new Item(100, "keyboard", 500, c1);
		item.save(i1);
		System.out.println("Sucessfully record save !");
		
	
	}
}
