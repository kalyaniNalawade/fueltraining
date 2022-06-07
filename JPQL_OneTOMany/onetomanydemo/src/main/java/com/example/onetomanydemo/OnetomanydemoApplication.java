package com.example.onetomanydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OnetomanydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnetomanydemoApplication.class, args);
		ApplicationContext context;
		context=SpringApplication.run(OnetomanydemoApplication.class, args);
		CartRepository cart;
		cart=context.getBean(CartRepository.class);
		ItemRepository item;
		item=context.getBean(ItemRepository.class);
		
		Cart c1=new Cart(1,"Vandu");
		cart.save(c1);
		
		
		Items i1=new Items(1,200,"Mouse",c1);
		item.save(i1);
		
		Items i2=new Items(2,500,"Keyboard",c1);
		item.save(i2);
	}

}
