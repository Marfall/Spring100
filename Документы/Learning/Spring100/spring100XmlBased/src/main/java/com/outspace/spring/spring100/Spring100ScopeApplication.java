package com.outspace.spring.spring100;

import com.outspace.spring.spring100.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Spring100ScopeApplication {

	private  static Logger LOGGER = LoggerFactory.getLogger(Spring100ScopeApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(Spring100ScopeApplication.class);

		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection());

		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcConnection());

		applicationContext.close();
	}
}
