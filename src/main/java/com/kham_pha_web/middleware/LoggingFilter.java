package com.kham_pha_web.middleware;


import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class LoggingFilter implements Filter {
    @Autowired
    private RequestCounter requestCounter;

    private static final Logger log = LoggerFactory.getLogger(LoggingFilter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;

        requestCounter.increment();

        long start = System.currentTimeMillis();
//        log.info("➡️ [Filter] {} {}", req.getMethod(), req.getRequestURI());

        chain.doFilter(request, response);

        long duration = System.currentTimeMillis() - start;
        log.info("⬅️ [Filter] {} {} ({} ms)", req.getMethod(), req.getRequestURI(), duration);
    }
}
