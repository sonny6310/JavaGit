package org;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConf {

	@Bean
	public A a() {
		return new A();
	}
}
