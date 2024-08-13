package com.transped.parcel_service;

import org.springframework.boot.SpringApplication;

public class TestParcelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(ParcelServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
