//package com.example.user_service.security;
//
//import jakarta.servlet.*;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.util.logging.Logger;
//
//@Component
//public class SimpleCORSFilter implements Filter {
//
//    //private final Logger log = LoggerFactory.getLogger(SimpleCORSFilter.class);
//
//    public SimpleCORSFilter() {
//        //log.info("SimpleCORSFilter init");
//    }
//
//    @Override
//    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException
//            , ServletException {
//
//        HttpServletRequest request = (HttpServletRequest) req;
//        HttpServletResponse response = (HttpServletResponse) res;
//
//        response.setHeader("Access-Control-Allow-Origin", "*");
//        response.setHeader("Access-Control-Allow-Credentials", "true");
//        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
//        response.setHeader("Access-Control-Max-Age", "3600");
//        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me");
//
//        chain.doFilter(req, res);
//    }
//
//    @Override
//    public void init(FilterConfig filterConfig) {
//    }
//
//    @Override
//    public void destroy() {
//    }
//
//}