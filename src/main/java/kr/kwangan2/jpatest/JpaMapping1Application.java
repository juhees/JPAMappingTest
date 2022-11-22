package kr.kwangan2.jpatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaMapping1Application {

	public static void main(String[] args) {
		SpringApplication application =
				new SpringApplication(JpaMapping1Application.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

}
