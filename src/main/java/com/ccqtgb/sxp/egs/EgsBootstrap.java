package com.ccqtgb.sxp.egs;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringCloudApplication
@EnableEurekaClient
public class EgsBootstrap
{
    public static void main(String[] args) {
		SpringApplication.run(EgsBootstrap.class, args);
	}
}
