package org.rvslab.chapter2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Chapter2BootrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chapter2BootrestApplication.class, args);
	}
}

/*
 * To test: curl http://localhost:8080
 * Or just open browser
 */
@RestController
class GreetingController{
	@RequestMapping("/")
	Greet greet(){
		return new Greet("Hello World");
	}
}

class Greet {
	private String message;
	
	public Greet(){}
	public Greet(String message){
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}

