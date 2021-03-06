package com.spring100.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		logger.info("All users -> {}", dao.findAll());
//		logger.info("Finded User Id 10001 -> {}", dao.findById(10001));
//		logger.info("Deleting 10002 ->  Rows deleted {}", dao.deleteById(10002));
//		logger.info("Inserting in 10004 -> {}",
//				dao.insert(new Person(10004, "Tara", "Berlin", new Date())));
//		logger.info("Update in 10003 -> {}",
//				dao.update(new Person(10003, "Pieter", "Moscow", new Date())));
	}
}
