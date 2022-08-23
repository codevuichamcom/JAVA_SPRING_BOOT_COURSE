package com.codevui.onetomany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);

		PersonRepository personRepository = context.getBean(PersonRepository.class);
		AddressRepository addressRepository = context.getBean(AddressRepository.class);

		// repository.findByFirstNameContainingAndLastNameContaining("1",
		// "2").forEach(System.out::println);
		// repository.findByFirstNameOrLastNameContaining("%1%").forEach(System.out::println);

		// for (int i = 1; i <= 100; i++) {
		// Person person = Person.builder().firstName("firstName" +
		// i).lastName("lastName" + i)
		// .emailAddress("emailAddress" + i).age(i).address_id(i).build();
		// repository.save(person);
		// }

		List<Person> listPersons = new ArrayList<>();

		Person p1 = Person.builder().firstName("Le").lastName("Quan").emailAddress("lequan@gmail.com").age(20)
				.build();
		Person p2 = Person.builder().firstName("Nguyen").lastName("Anh").emailAddress("NguyenAnh@gmail.com").age(19)
				.build();
		Address address = Address.builder().address("Ha Noi").build();
		p1.setAddress(address);
		p2.setAddress(address);
		listPersons.add(p1);
		listPersons.add(p2);
		address.setPersons(listPersons);

		addressRepository.save(address);

		addressRepository.delete(address);

		// List<Person> lisPersons = personRepository.findAll();
		// for (Person a : lisPersons) {
		// System.out.println(a.getAddress());
		// }

		List<Address> lisAddresses = addressRepository.findAll();
		for (Address a : lisAddresses) {
			System.out.println(a.getAddress());
			System.out.println(a.getPersons());
		}

		// addressRepository.deleteById(3);

	}

}
