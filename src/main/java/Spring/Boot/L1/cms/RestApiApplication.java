package Spring.Boot.L1.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class RestApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestApiApplication.class, args);
	}

}
