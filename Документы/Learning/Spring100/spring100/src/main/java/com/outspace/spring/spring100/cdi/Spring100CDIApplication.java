package com.outspace.spring.spring100.cdi;

import com.outspace.spring.spring100.basic.BinarySearchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring100CDIApplication {

	private  static Logger LOGGER = LoggerFactory.getLogger(Spring100CDIApplication.class);


	public static void main(String[] args) {

		ApplicationContext applicationContext =
				SpringApplication.run(Spring100CDIApplication.class, args);

		SomeCDIBusiness someCDIBusiness
				= applicationContext.getBean(SomeCDIBusiness.class);

		LOGGER.info("{} dao", someCDIBusiness, someCDIBusiness.getSomeCDIDAO());

	}

}
