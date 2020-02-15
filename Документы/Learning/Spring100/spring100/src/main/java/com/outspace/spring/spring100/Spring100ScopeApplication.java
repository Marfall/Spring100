package com.outspace.spring.spring100;

import com.outspace.spring.spring100.scope.PersonDAO;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring100ScopeApplication {

	private  static Logger LOGGER = LoggerFactory.getLogger(Spring100ScopeApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext =
				SpringApplication.run(Spring100ScopeApplication.class, args);

		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection());

		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcConnection());
	}
}
