package pers.rikoui.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient	//@EnableDiscoveryClient所有注册中心都可以使用，注册中心为eureka时使用@EnableEurekaClient
public class RibbonApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}
	
	/**
	 * 向程序的ioc注入一个bean: restTemplate;@LoadBalanced注解表明这个restRemplate开启负载均衡的功能
	 * @return
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate () {
		return new RestTemplate();
	}

}
