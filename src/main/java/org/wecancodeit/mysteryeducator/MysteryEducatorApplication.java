package org.wecancodeit.mysteryeducator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysteryEducatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysteryEducatorApplication.class, args);

		System.out.println("Server Side is wired up!");
	}

	
}
