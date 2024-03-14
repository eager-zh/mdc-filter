package com.github.mdcfilter.filter;

import java.io.IOException;
import java.util.UUID;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

@Component
public class MdcFilter implements Filter {

	public static final String REQUEST_ID_ATTRIBUTE_NAME = "requestId";

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	    try {
	        String requestId = UUID.randomUUID().toString();
	        MDC.put(REQUEST_ID_ATTRIBUTE_NAME, requestId);
	        chain.doFilter(request, response);
	    } finally {
	        MDC.remove(REQUEST_ID_ATTRIBUTE_NAME);
	    }
	}
	
}
