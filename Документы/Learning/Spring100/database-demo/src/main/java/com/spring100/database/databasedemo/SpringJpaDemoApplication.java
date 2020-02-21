package com.spring100.database.databasedemo;

import com.spring100.database.databasedemo.entity.Person;
import com.spring100.database.databasedemo.jpa.PersonJpaRepository;
import com.spring100.database.databasedemo.springdata.PersonSpringDataRepository;
import org.h2.tools.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;
import java.util.Date;


@SpringBootApplication
public class SpringJpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonSpringDataRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("\nUser id 10001 -> {}", repository.findById(10001));


		logger.info("\nInserting 10004 -> {}",
				repository.save(new Person(10004, "Tara", "Berlin", new Date())));

		logger.info("\nUpdate 10003 -> {}",
				repository.save(new Person(10003, "Pieter", "Utrecht", new Date())));

		repository.deleteById(10002);

		logger.info("\nAll users -> {}", repository.findAll());

	}
	//@Profile("dev")
	@Bean(initMethod = "start", destroyMethod = "stop")
	public Server h2Server() throws SQLException {
		return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092");
	}
}
