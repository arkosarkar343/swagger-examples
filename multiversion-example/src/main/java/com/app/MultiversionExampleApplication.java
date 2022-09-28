package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@SpringBootApplication
@EnableWebMvc
public class MultiversionExampleApplication  {

	

	public static void main(String[] args) {
		SpringApplication.run(MultiversionExampleApplication.class, args);
	}
	
	@Bean
	public Docket apiV1() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("v1")
				.apiInfo(new ApiInfoBuilder()
						.title("My App example")
						.description("My App Description").build())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.app"))
				.paths(PathSelectors.ant("/v1/**")).build();
	}
	@Bean
	public Docket apiV2() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("v2")
				.apiInfo(new ApiInfoBuilder()
						.title("My App example")
						.description("My App Description")
						.build())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.app"))
				.paths(PathSelectors.ant("/v2/**"))
				.build();
	}
	

}
