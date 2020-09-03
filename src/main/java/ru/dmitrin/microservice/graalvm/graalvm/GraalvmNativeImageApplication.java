package ru.dmitrin.microservice.graalvm.graalvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraalvmNativeImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraalvmNativeImageApplication.class, args);
	}

}