package com.chousann;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class MyListener implements SpringApplicationRunListener {

	//必须有的构造器
    public MyListener(SpringApplication application, String[] args) {

    }
    
	@Override
	public void starting() {
		// TODO Auto-generated method stub
		System.out.print("MyListener starting...");
	}

	@Override
	public void environmentPrepared(ConfigurableEnvironment environment) {
		// TODO Auto-generated method stub
		System.out.print("MyListener environmentPrepared...");
		
	}

	@Override
	public void contextPrepared(ConfigurableApplicationContext context) {
		// TODO Auto-generated method stub
		System.out.print("MyListener contextPrepared...");
	}

	@Override
	public void contextLoaded(ConfigurableApplicationContext context) {
		// TODO Auto-generated method stub
		System.out.print("MyListener contextLoaded...");
	}

	@Override
	public void started(ConfigurableApplicationContext context) {
		// TODO Auto-generated method stub
		System.out.print("MyListener started...");
	}

	@Override
	public void running(ConfigurableApplicationContext context) {
		// TODO Auto-generated method stub
		System.out.print("MyListener running...");
	}

	@Override
	public void failed(ConfigurableApplicationContext context, Throwable exception) {
		// TODO Auto-generated method stub
		System.out.print("MyListener failed...");
	}

}
