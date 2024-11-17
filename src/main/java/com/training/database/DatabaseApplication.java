package com.training.database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class DatabaseApplication {

	private final DataSource dataSource;

    public DatabaseApplication(final DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {

		SpringApplication.run(DatabaseApplication.class, args);
	}

}
