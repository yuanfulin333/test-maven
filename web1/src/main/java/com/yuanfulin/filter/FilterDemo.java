package com.yuanfulin.filter;

import org.apache.coyote.Response;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * ClassName:FilterDemo
 * Package:com.yuanfulin.filter
 * Description:
 *
 * @DATE:2023/7/30 16:13
 * @Author:袁福林
 */
//@WebFilter(urlPatterns ="/*")
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
             System.out.println("开始");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("拦截");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("放行");
    }

    @Override
    public void destroy() {
    System.out.println("结束");
    }
}
