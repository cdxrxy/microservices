package org.example.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator registeredRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/eureka/web")
                        .filters(f -> f.stripPrefix(2))
                        .uri("http://localhost:8761"))
                .route(p -> p
                        .path("/eureka/**")
                        .uri("http://localhost:8761"))
                .route(p -> p
                        .path("/api/inventories")
                        .uri("lb://inventory-service"))
                .route(p -> p
                        .path("/api/orders")
                        .uri("lb://order-service"))
                .route(p -> p
                        .path("/api/products")
                        .uri("lb://product-service"))
                .build();
    }
}
