/**
 * 
 */
package com;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author ping.huang
 * 2017年8月28日
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ImportResource(locations = {"classpath*:META-INF/spring/spring-*.xml"})
@MapperScan(basePackages = {"com.yoho.springboot.dal", "com.hp.core.webjars.dal"})
public class Application {

	static Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		log.info("start Application");
		try {
			SpringApplication.run(Application.class, args);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("start success Application");
	}
}
