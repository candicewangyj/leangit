package com.briup.mvnbook.helloworld;
public class HelloWorld{
	public String sayHello(){
		return "hello maven";
	}
	public static void main(String[] args){

		System.out.println(new HelloWorld().sayHello());
	}


}
