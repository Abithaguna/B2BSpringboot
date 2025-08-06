////package com.example.config;
////
////
////import org.springframework.context.annotation.Bean;
////import org.springframework.context.annotation.Configuration;
////import org.springframework.context.annotation.Primary;
////import org.springframework.web.cors.CorsConfiguration;
////import org.springframework.web.cors.CorsConfigurationSource;
////import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
////
////import java.util.List;
////
////@Configuration
////public class CorsConfig {
////
////    @Bean
////    @Primary
////    public CorsConfigurationSource corsConfigurationSource() {
////        CorsConfiguration cfg = new CorsConfiguration();
////        cfg.setAllowedOrigins(List.of("http://127.0.0.1:5500"));
////        cfg.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
////        cfg.setAllowedHeaders(List.of("*"));
////        cfg.setAllowCredentials(true);
////
////        UrlBasedCorsConfigurationSource src = new UrlBasedCorsConfigurationSource();
////        src.registerCorsConfiguration("/**", cfg);
////        return src;
////    }
////}
//
//package com.example.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class CorsConfig {
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**")
//                    .allowedOrigins("http://127.0.0.1:5500")
//                    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//                    .allowedHeaders("*")
//                    .allowCredentials(true);
//            }
//        };
//    }
//}
//
