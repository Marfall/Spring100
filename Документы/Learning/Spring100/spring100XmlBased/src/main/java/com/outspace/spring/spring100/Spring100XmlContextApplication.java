package com.outspace.spring.spring100;

import com.outspace.spring.spring100.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Spring100XmlContextApplication {

	private  static Logger LOGGER = LoggerFactory.getLogger(Spring100XmlContextApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml")) {




			LOGGER.info("Beans Loaded -> {}",
					(Object)applicationContext.getBeanDefinitionNames());

			XMLPersonDAO personDAO = applicationContext.getBean(XMLPersonDAO.class);

			System.out.println(personDAO);
			System.out.println(personDAO.getXmlJdbcConnection());
		}
	}
}
