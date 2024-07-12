package com.hello.earth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
public class EarthApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World in ubuntu";
	}

	//@GetMapping(path = "/apple")
	@RequestMapping("/apple")
	public ResponseEntity<Object> getSomeParameters() {
		return ResponseEntity.status(HttpStatus.OK).body(Map.of(
				"key-1", "value-1",
				"key-2", "value-2",
				"key-3", "value-3"));
	}

	public static void main(String[] args) {
		SpringApplication.run(EarthApplication.class, args);
	}

}
