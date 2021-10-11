package com.tripathi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication(scanBasePackages = {"com.tripathi"},exclude = {HibernateJpaAutoConfiguration.class})
public class TaskManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagementApplication.class, args);
	}
}
