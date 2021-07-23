package com.jp.design.patterns.structural.proxy;

public class Client {

	public static void main(String[] args) {
	
		Internet internet = new ProxyInternet();
		internet.accessWebsite("www.newsIndia.com");
		
		
	}
	
}
