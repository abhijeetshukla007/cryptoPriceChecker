package com.checker.crypto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Abhijeet
 *
 */
@SpringBootApplication
public class CryptoCheckerApplication extends SpringBootServletInitializer
{
	public static void main(String[] args) {
		SpringApplication.run(CryptoCheckerApplication.class, args);
	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CryptoCheckerApplication.class);
    }
}
