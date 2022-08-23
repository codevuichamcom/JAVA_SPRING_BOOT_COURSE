package com.codevui.onetoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);

		PersonRepository repository = context.getBean(PersonRepository.class);

		// repository.findByFirstNameContainingAndLastNameContaining("1",
		// "2").forEach(System.out::println);
		repository.findByFirstNameOrLastNameContaining("%1%").forEach(System.out::println);

		// for (int i = 1; i <= 100; i++) {
		// Person person = Person.builder().firstName("firstName" +
		// i).lastName("lastName" + i)
		// .emailAddress("emailAddress" + i).age(i).address_id(i).build();
		// repository.save(person);
		// }

	}

}
