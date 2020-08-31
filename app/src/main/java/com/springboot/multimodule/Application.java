package com.springboot.multimodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableConfigurationProperties
@SpringBootApplication(scanBasePackages = "com.springboot.multimodule")
@EnableJpaRepositories(basePackages = "com.springboot.multimodule.*.repositories")
@EntityScan(basePackages = "com.springboot.multimodule")
@EnableSwagger2
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(com.springboot.multimodule.Application.class, args);
  }
}
