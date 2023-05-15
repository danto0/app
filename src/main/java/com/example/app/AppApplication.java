package com.example.app;

import com.example.lib.WRCar;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AppApplication.class, args);
		setCar();
	}

	public static void setCar() {
		WRCar car = new WRCar(4);
	}

}
