package br.com.unifacisa.lsi.eurekaservicediscovey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceDiscoveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceDiscoveyApplication.class, args);
	}

}
