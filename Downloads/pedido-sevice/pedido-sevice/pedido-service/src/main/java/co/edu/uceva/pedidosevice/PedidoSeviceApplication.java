package co.edu.uceva.pedidosevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class PedidoSeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedidoSeviceApplication.class, args);
	}

}
