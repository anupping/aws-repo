package com.lambda.lambdaOne;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LambdaOneApplication {

	@Autowired
	private InventoryRepo inventoryRepo;
	
	@Bean
	public Supplier<List<Inventory>> inventory() {
		System.out.println("Lambda function invoked for inventory");
		
		return () -> inventoryRepo.buildInventory();
		
	}
	
	@Bean
	public Function<String, List<Inventory>> findOrberByName() {
		System.out.println("Lambda function invoked for findOrberByName");
		return (input) -> inventoryRepo.buildInventory().stream().filter(inventory -> inventory.getName().equals(input)).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(LambdaOneApplication.class, args);
	}

}
