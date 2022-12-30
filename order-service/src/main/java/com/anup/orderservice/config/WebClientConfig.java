package com.anup.orderservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    @LoadBalanced
    public WebClient.Builder webClientBuilder(){
        return WebClient.builder();
    }
    //using LoadBalanced annotation and WebClient.Builder we assure that when order-service
    //service will call inventory-service it won't be confused if it finds multiple instances
    //of inventory-service and just call one after another
}
