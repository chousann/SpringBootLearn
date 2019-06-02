package com.chousann.myconfig.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextUtils implements ApplicationContextAware {

	private static ApplicationContext applicationContext;
	

	//获取依赖注入上下文
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("not null");
		if(ApplicationContextUtils.applicationContext == null) {
			System.out.println("null");
			ApplicationContextUtils.applicationContext = applicationContext;
        }
	}
	
	//获取applicationContext
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

	
	
	public static Object getBean(String name){
        return getApplicationContext().getBean(name);
    }


}
