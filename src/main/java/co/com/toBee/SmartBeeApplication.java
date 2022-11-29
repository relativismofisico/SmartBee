package co.com.toBee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SmartBeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartBeeApplication.class, args);
	}

}
