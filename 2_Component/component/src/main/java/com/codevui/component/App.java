package com.codevui.component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.codevui.component.core.Girl;
import com.codevui.component.external.Boy;

@SpringBootApplication()
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);

		// IOutfit outfit = context.getBean(IOutfit.class);

		// System.out.println("Outfit: " + outfit);

		Girl girl = context.getBean(Girl.class);

		System.out.println("Girl instance: " + girl);

		System.out.println("Outfit of girl: " + girl.outfit);

		girl.outfit.wear();

		Boy boy = context.getBean(Boy.class);

		System.out.println("Boy instance: " + boy);

	}

}
