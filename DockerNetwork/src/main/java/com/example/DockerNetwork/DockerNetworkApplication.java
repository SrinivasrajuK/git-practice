package com.example.DockerNetwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerNetworkApplication.class, args);
	}
	
	@GetMapping("/test")
	public String m12()
	{
		return "cdbcdsjccd";
	}

}
