package com.vanpine.Config;

import com.vanpine.Interception.WebMVCInterception;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@RequiredArgsConstructor
public class InterceptionConfiguration extends WebMvcConfigurationSupport {
    private final WebMVCInterception webMVCInterception;

    /*
     * 处理拦截器
     * */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(webMVCInterception).excludePathPatterns("/**");
    }

    /*
     * 处理静态资源(有需要再进行处理)
     * */

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
