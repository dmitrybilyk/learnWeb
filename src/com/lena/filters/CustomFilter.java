package com.lena.filters;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by dmitry on 20.11.17.
 */
public class CustomFilter implements Filter {
//    private FilterConfig filterConfig;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String param1 = servletRequest.getParameter("fromBrowser");
//        ServletContext servletContext = filterConfig.getServletContext();
//        servletContext.log(param1);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
