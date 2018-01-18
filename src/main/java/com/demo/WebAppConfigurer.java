package com.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter {
	

	 @Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
	        super.configurePathMatch(configurer);
	        // 常用的两种
	        // 匹配结尾 / :会识别 url 的最后一个字符是否为 /
	        // localhost:8080/test 与 localhost:8080/test/ 等价
	        configurer.setUseTrailingSlashMatch(true);
	        // 匹配后缀名：会识别 xx.* 后缀的内容
	        // localhost:8080/test 与 localhost:8080/test.jsp 等价
	        configurer.setUseSuffixPatternMatch(true);

	        // TODO PathMatchConfigurer 还提供其他的一些 api 以供使用
	    }
	
}
