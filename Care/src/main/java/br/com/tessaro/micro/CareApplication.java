package br.com.tessaro.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CareApplication {

	public static void main(String[] args) {
		SpringApplication.run(CareApplication.class, args);
	}

}
