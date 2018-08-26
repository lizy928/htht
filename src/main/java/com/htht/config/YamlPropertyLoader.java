package com.htht.config;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Configuration
@Component
public class YamlPropertyLoader {
	
	@Bean
	public PropertySource<?> yamlPropertySourceLoader() throws IOException {
		YamlPropertySourceLoader loader = new YamlPropertySourceLoader();
		PropertySource<?> applicationYamlPropertySource = loader.load("application.yml", new ClassPathResource("application.yml"), "default");
		return applicationYamlPropertySource;
	}
}
