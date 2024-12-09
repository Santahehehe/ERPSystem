package com.dowell.ERPSystem.AuthoritySystem.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 設定哪些路徑可以接受來自哪些域的請求
        registry.addMapping("/**")  // 允許所有路徑
                .allowedOrigins("http://localhost:3000")  // 允許來自前端的請求（這裡假設前端運行在localhost:3000）
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // 許可的 HTTP 方法
                .allowedHeaders("*")  // 允許所有的請求標頭
                .allowCredentials(true);  // 是否允許認證
    }
}