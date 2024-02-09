package io.github.karinaerikads.msgatewaycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsgatewaycloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsgatewaycloudApplication.class, args);
	}

}
