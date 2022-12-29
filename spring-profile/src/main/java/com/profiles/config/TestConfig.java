package com.profiles.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = { "com.profiles.beans" })
@PropertySource("classpath:db-test.properties")
@Profile("test")
public class TestConfig {

}
