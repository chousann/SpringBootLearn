package com.chousann;

public class myservice2 {
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public String toString() {
		return "name:" + name + "," + "age:" + age;
	}
}
