package com.sqgxy.jmp.ems_bs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.sqgxy.jmp.ems_bs.mapper")
public class EmsBsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsBsApplication.class, args);
	}

}
