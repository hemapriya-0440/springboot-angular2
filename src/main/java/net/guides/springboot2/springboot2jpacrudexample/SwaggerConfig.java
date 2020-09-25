package net.guides.springboot2.springboot2jpacrudexample;



import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import net.guides.springboot2.springboot2jpacrudexample.controller.EmployeeController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan(basePackageClasses={EmployeeController.class})
public class SwaggerConfig {

	/*@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}*/
	 @Bean
	    public Docket productApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("net.guides.springboot2.springboot2jpacrudexample.controller"))
	                .paths(regex("/api/v1/.*"))
	                .build()
	                .apiInfo(metaData());
	    }

	    private ApiInfo metaData() {
	        return new ApiInfoBuilder()
	                .title("ACCS USER")
	                .description("\"Spring Boot REST API for ACCS USER\"")
	                .version("1.0.0")
	                .license("MPHASIS")
	                .build();
	    }
	    
	    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("swagger-ui.html")
	                .addResourceLocations("classpath:/META-INF/resources/");
	        registry.addResourceHandler("/webjars/**")
	                .addResourceLocations("classpath:/META-INF/resources/webjars/");
	    }

}

