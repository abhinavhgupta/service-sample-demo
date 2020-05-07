package com.example.demo;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
public class BookController {
	public String getBook() {
		return new Book(1, "ddddd").getBookName();
	}
}
