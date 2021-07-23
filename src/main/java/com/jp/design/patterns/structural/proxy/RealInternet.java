package com.jp.design.patterns.structural.proxy;

public class RealInternet implements Internet {

	@Override
	public void accessWebsite(String url) {
		System.out.println("accessing " + url);
	}

}
