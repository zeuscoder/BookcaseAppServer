package cn.zeus.bookcase.boot.config;

import cn.zeus.bookcase.filter.AccessTokenCheckInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 添加拦截器用于检测token
 * <p>
 * Created by lvzimou on 16-8-22.
 */
@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(accessTokenConsistencyCheckInterceptor())
//                .addPathPatterns("/address/**");
    }

    @Bean
    public AccessTokenCheckInterceptor accessTokenConsistencyCheckInterceptor() {
        return new AccessTokenCheckInterceptor();
    }
}
