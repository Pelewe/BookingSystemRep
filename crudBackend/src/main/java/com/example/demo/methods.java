package com.example.demo;

public class methods {

	public String upperFirst(String name)
	{
		String temp;
		temp=name;
		int size=name.length();
		name=temp.substring(0, 1).toUpperCase()+temp.substring(1,size);
		
		return name;
	}
	public String lowerAll(	String name) {
		String temp;
		temp=name;
		int size=name.length();
		name=temp.substring(0, size).toUpperCase();
		return name;
	}
}
