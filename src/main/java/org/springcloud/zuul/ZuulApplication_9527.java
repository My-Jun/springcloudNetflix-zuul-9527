package org.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy // 开启zuul代理
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class ZuulApplication_9527 {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication_9527.class, args);

	}

}
