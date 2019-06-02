package com.chousann.myProperties.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Env {
	@Value("${environment}")
	private String environment;

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	@Override
	public String toString() {
		return "Environment [environment=" + environment + "]";
	}
	
}
