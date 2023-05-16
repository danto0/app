package com.example.app;

import com.example.lib.WRCarrr;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.google.common.base.Strings;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AppApplication.class, args);
		setCar();
		Strings.repeat("hi", 4);
	}

	public static void setCar() {
		WRCar car = new WRCarrr(4);
	}

}
