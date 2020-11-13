package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

	@RestController
	public class TestController {

		@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
		public String echo(@PathVariable String id) {

			String name = "";
			switch (id) {
			case "1":
				name = "tom";
			case "2":
				name = "jerry";
			case "3":
				name = "bob";
			case "4":
				name = "anne";
			case "5":
				name = "jack";
			case "6":
				name = "kobe";
			default:
				name = "nobody";
			}
			return name;
		}

	}
}