package com.example;

import com.example.domain.Adopter;
import com.example.service.AdopterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;


@SpringBootApplication
public class AdoptionSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdoptionSpringBootApplication.class, args);
	}


}

@Component
class MyRunner implements CommandLineRunner{
	@Autowired
	private AdopterService adopterService;
	@Override
	public void run(String... args) throws Exception{
		System.out.println("MyRunner called");

		List<Adopter> result = adopterService.getAdopters();
		System.out.println("result: " + result.size());
		result.forEach(System.out::println);
	}

}
