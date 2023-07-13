package com.itheima.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * ClassName: DemoFilter
 * Package: com.itheima.filter
 * Description:
 *
 * @Author: Lucidity
 * @Create: 2023/6/8 - 11:34
 * @Version: v1.0
 */

//@WebFilter(urlPatterns = "/*")
public class DemoFilter implements Filter {
    @Override //初始化方法, 只调用一次
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init 初始化方法执行了");
    }

    @Override //拦截到请求之后调用, 调用多次
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Demo 拦截到了请求...放行前逻辑");
        //放行
        chain.doFilter(request,response);

        System.out.println("Demo 拦截到了请求...放行后逻辑");
    }

    @Override //销毁方法, 只调用一次
    public void destroy() {
        System.out.println("destroy 销毁方法执行了");
    }
}
