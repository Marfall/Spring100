package com.outspace.spring.spring100;

import com.outspace.spring.spring100.basic.BinarySearchImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.outspace.spring.spring100")
public class Spring100BasicApplication {

	public static void main(String[] args) {

		try (ConfigurableApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(Spring100BasicApplication.class)) {

			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

			System.out.println(binarySearch);
			System.out.println(binarySearch1);

			int result = binarySearch.binarySearch(new int[]{12, 4, 6,}, 3);

			System.out.println(result);
		}
	}
}
