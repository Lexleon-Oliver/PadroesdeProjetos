package one.digitalinnovation.padroesprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadroesprojetospringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesprojetospringApplication.class, args);
	}

}
