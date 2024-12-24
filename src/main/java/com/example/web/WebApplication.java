package com.example.web;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebApplication implements CommandLineRunner
{
	@Value("${spring.profiles.active:'no profile'}")
	private String activeProfile;

	static Logger log = LogManager.getLogger(WebApplication.class);

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {


		SpringApplication.run(WebApplication.class, args);

		int a = 1;

	}

	/**
	 * @param args
	 * @throws Exception
	 */
	@Override
	public void run(String... args) throws Exception {

		log.info("log asd");
		log.info("a");
		log.info("a");
		log.info("a");
		log.info(System.getProperty("os.name"));
		log.info(System.getProperty("user.dir"));
		log.info(Runtime.getRuntime().totalMemory());


		int a = 1;

	}
}
