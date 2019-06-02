package com.chousann;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFilter extends HttpFilter {
	@Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        if (!(request instanceof HttpServletRequest)) {
            throw new ServletException(request + " not HttpServletRequest");
        }
        if (!(response instanceof HttpServletResponse)) {
            throw new ServletException(request + " not HttpServletResponse");
        }
        
        HttpServletRequest req1 = (HttpServletRequest) request;
        System.out.print("RequestURL:" + req1.getRequestURL() + "\n");
        System.out.print("RequestURI:" + req1.getRequestURI() + "\n");
        doFilter((HttpServletRequest) request, (HttpServletResponse) response, chain);
    }
}
