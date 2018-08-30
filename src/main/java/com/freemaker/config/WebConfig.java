package com.freemaker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @program:
 * @description: 配置了视图解析器以及RequestMapper的扫描范围
 * @author: Elk love madness
 * @create: 2018-08-29 14:25
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.freemaker.controller")
public class WebConfig extends WebMvcConfigurerAdapter {

  /**
   * 启用spring mvc 的注解
   */
  @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    configurer.enable();
  }

}
