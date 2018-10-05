package br.unip.ads.pim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
@SpringBootApplication
public class PimApplication {

	public static void main(String[] args) {
		SpringApplication.run(PimApplication.class, args);
	}
}
