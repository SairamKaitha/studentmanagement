/**
 * 
 */
package com.tt.student.swaggerConfig;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

/**
 * 
 */
@OpenAPIDefinition
@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI basicOpenAPI() {
		return new OpenAPI().info(new Info()
				            .title("studentMannagement")
				            .version("3.0.0")
				            .description("student app")
				             );
	}
}
