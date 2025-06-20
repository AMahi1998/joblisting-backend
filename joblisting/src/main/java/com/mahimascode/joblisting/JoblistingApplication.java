package com.mahimascode.joblisting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2
public class JoblistingApplication {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)).paths(PathSelectors.any())
				.build().apiInfo(apiInfo()).useDefaultResponseMessages(false);
	}

	@Bean
	public ApiInfo apiInfo() {
		final ApiInfoBuilder builder = new ApiInfoBuilder();
		return builder.build();

	public static void main(String[] args) {
		SpringApplication.run(JoblistingApplication.class, args);
	}

}
