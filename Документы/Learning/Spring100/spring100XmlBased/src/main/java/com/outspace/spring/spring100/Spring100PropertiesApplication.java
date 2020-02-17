package com.outspace.spring.spring100;

import com.outspace.spring.spring100.properties.SomeExternalService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.outspace.spring.spring100")
@PropertySource("classpath:app.properties")
public class Spring100PropertiesApplication {

	public static void main(String[] args) {

		try (ConfigurableApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(Spring100PropertiesApplication.class)) {

			SomeExternalService someExternalService =
					applicationContext.getBean(SomeExternalService.class);

			System.out.println("CURRENT URL: " + someExternalService.returnServiceURL());
		}
	}
}
