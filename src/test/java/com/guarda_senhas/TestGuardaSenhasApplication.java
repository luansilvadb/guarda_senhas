package com.guarda_senhas;

import org.springframework.boot.SpringApplication;

public class TestGuardaSenhasApplication {

	public static void main(String[] args) {
		SpringApplication.from(GuardaSenhasApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
