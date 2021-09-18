package org.springframework.debug;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * spring debug application.
 *
 * @author peng zhi kang
 * @version 1.0.0
 */
@ComponentScan
@Configuration
public class SpringDebugApplication {

	private String host = "localhost";

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringDebugApplication.class);
		SpringDebugApplication app = context.getBean(SpringDebugApplication.class);
		System.out.println(app.host);
	}
}
