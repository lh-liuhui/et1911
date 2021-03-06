package com.etoak.startup;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.etoak.config.RootConfig;
import com.etoak.config.SpringmvcConfig;

public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	//spring root容器
	@Override
	protected Class<?>[] getRootConfigClasses() {
	
		return new Class[] {RootConfig.class};
	}

	//spring mvc容器
	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {SpringmvcConfig.class};
	}

	//拦截地址
	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

}
