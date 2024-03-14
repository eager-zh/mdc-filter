package com.github.mdcfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.github.mdcfilter.controller.Controller;
import com.github.mdcfilter.filter.MdcFilter;

@SpringBootApplication
@ComponentScan(basePackageClasses = {MdcFilter.class, Controller.class})
public class MdcFilterApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MdcFilterApplication.class, args);
	}

}