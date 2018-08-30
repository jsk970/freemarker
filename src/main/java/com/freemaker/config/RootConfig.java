package com.freemaker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import java.util.Properties;

/**
 * @program:
 * @description: ${description}
 * @author: Elk love madness
 * @create: 2018-08-29 14:20
 */
@Configuration
@ComponentScan(basePackages = { "com.freemaker" })
public class RootConfig {

  @Bean
  public FreeMarkerConfigurer freeMarkerConfigurer() {
    FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
    configurer.setDefaultEncoding("utf-8");
    configurer.setTemplateLoaderPath("/WEB-INF/views/");
    Properties properties = new Properties();
    properties.setProperty("defaultEncoding", "UTF-8");
    configurer.setFreemarkerSettings(properties);
    return configurer;
  }
  @Bean
  public FreeMarkerViewResolver freeMarkerViewResolver() {
    FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
    resolver.setSuffix(".ftl");
    resolver.setContentType("text/html;charset=UTF-8");
    resolver.setCache(false);
    resolver.setExposeRequestAttributes(true);
    resolver.setRequestContextAttribute("request");
    resolver.setOrder(0);
    return resolver;
  }
}
