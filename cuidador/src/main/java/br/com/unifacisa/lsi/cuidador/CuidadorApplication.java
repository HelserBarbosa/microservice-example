package br.com.unifacisa.lsi.cuidador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CuidadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CuidadorApplication.class, args);
	}

}
