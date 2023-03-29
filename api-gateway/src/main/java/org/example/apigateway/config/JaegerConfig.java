package org.example.apigateway.config;

import io.jaegertracing.internal.JaegerTracer;
import io.jaegertracing.internal.samplers.ConstSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JaegerConfig {
    @Bean
    public JaegerTracer jaegerTracer() {
        return new io.jaegertracing.Configuration("api-gateway")
                .withSampler(new io.jaegertracing.Configuration.SamplerConfiguration().withType(ConstSampler.TYPE))
                .withReporter(new io.jaegertracing.Configuration.ReporterConfiguration().withLogSpans(true))
                .getTracer();
    }
}
