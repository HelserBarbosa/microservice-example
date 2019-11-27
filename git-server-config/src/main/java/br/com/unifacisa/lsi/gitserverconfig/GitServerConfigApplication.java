package br.com.unifacisa.lsi.gitserverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GitServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitServerConfigApplication.class, args);
	}

}
