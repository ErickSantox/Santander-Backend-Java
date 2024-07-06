package dio.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@OpenAPIDefinition(servers = { @Server(url = "/",description = "default Server URL")})
@SpringBootApplication
public class SantanderBackendJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderBackendJavaApplication.class, args);
	}

}
