package cn.zeus.bookcase.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 允许JS跨域处理过滤器
 * <p>
 * Created by lvzimou on 16-8-22.
 */
@Component("corsFilter")
public class CORSFilter implements Filter {

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, token, BookcaseAccessToken, BookcaseUserId");
        chain.doFilter(req, res);
    }

    public void init(FilterConfig filterConfig) {
        return;
    }

    public void destroy() {
        return;
    }
}
