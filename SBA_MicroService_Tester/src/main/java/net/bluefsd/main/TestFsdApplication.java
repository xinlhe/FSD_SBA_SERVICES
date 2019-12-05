package net.bluefsd.main;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestFsdApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		SpringApplication.run(TestFsdApplication.class, args);
	}
	
	   @Bean
	    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
	        return args -> {

	            //System.out.println("Let's inspect the beans provided by Spring Boot:");

//	            String[] beanNames = ctx.getBeanDefinitionNames();
//	            Arrays.sort(beanNames);
//	            for (String beanName : beanNames) {
//	                System.out.println(beanName);
//	            }

	        };
	    }
}