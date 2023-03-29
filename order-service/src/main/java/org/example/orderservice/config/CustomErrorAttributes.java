package org.example.orderservice.config;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;
import java.util.Optional;

@Component
public class CustomErrorAttributes extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, options);
        errorAttributes.put("message", Optional.ofNullable(super.getError(webRequest))
                .orElse(new HttpServerErrorException(HttpStatus.SERVICE_UNAVAILABLE, "Something went wrong, please try again later"))
                .getMessage());
        return errorAttributes;
    }
}
