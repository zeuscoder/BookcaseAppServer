package cn.zeus.bookcase.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用于检查accessToken的一致性
 * <p>
 * Created by lvzimou on 16-8-22.
 */
public class AccessTokenCheckInterceptor implements HandlerInterceptor {

    private static final Logger LOG = LoggerFactory
            .getLogger(AccessTokenCheckInterceptor.class);

    protected final static String BOOKCASE_ACCESS_TOKEN = "BookcaseAccessToken";
    protected final static String BOOKCASE_USER_ID = "BookcaseUserId";
    protected final static String BOOKCASE_PRODUCT_ID = "BookcaseProductId";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws AccessTokenException {
        LOG.info("*****************HandlerInterceptor******************");
        String anjubaoAccessToken = request.getHeader(BOOKCASE_ACCESS_TOKEN);
        String anjubaoDyId = request.getHeader(BOOKCASE_USER_ID);
        String anjubaoProductId = request.getHeader(BOOKCASE_PRODUCT_ID);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
