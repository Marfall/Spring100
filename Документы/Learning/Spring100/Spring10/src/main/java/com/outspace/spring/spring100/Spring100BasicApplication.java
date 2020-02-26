package com.outspace.spring.spring100;

import com.outspace.spring.spring100.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring100BasicApplication {

	// What are te beans?
	// What are the dependencies for the beans
	// Where to search for beans

	public static void main(String[] args) {

		ApplicationContext applicationContext =
				SpringApplication.run(Spring100BasicApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		//System.out.println("Fucking algorithm is: " + binarySearch.getSortAlgorithm());
		System.out.println(binarySearch);
		System.out.println(binarySearch1);

		int result = binarySearch.binarySearch(new int[] {12, 4, 6, }, 3);

		System.out.println(result);

	}

}
