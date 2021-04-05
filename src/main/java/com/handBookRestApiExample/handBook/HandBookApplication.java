package com.handBookRestApiExample.handBook;

import com.handBookRestApiExample.handBook.model.HandBookOfRegions;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@MappedTypes(HandBookOfRegions.class)
@MapperScan("com.handBookRestApiExample.handBook.mapper")
@SpringBootApplication
public class HandBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandBookApplication.class, args);
	}

}
