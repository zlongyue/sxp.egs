package com.ccqtgb.sxp.egs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

 
@Configuration
@EnableSwagger2
@EnableConfigurationProperties({SwaggerProperties.class})
public class SwaggerConfiguration {
	@Autowired
	private  SwaggerProperties swaggerProperties;
	@Bean
	public Docket createApi() {
		return new Docket(				
				 DocumentationType.SWAGGER_2)
				.groupName(swaggerProperties.getGroup())
				.genericModelSubstitutes(DeferredResult.class)
				.useDefaultResponseMessages(false).forCodeGeneration(true)
				.pathMapping(swaggerProperties.getPathMapping())// api测试请求地址
				.select()
//				.apis(RequestHandlerSelectors.basePackage(swaggerProperties.getBasePackage()))
				.paths(PathSelectors.regex(swaggerProperties.getRegexUrl()))// 过滤的接口
				.paths(PathSelectors.any())
				.build()
				.apiInfo(createApiInfo());
	}
	
	private ApiInfo createApiInfo() {
		ApiInfoBuilder apiInfoBuilder=new ApiInfoBuilder();
		apiInfoBuilder/*.contact(new Contact(swaggerProperties.getName(), 
				swaggerProperties.getUrl()
				, swaggerProperties.getEmail()))*/
		.description(swaggerProperties.getDescription())
		.license(swaggerProperties.getLicense())
		.licenseUrl(swaggerProperties.getLicenseUrl())
		.termsOfServiceUrl(swaggerProperties.getTermsOfServiceUrl())
		.title(swaggerProperties.getTitle())
		.version(swaggerProperties.getVersion());
		return apiInfoBuilder.build();
	}
}
