package com.jp.design.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ProxyInternet implements Internet {

	private Internet internet;
	private List<String> blockedSites = new ArrayList<String>();

	public ProxyInternet() {
		internet = new RealInternet();
		blockedSites.addAll(Arrays.asList("www.youtube.com", "www.facebook.com"));
	}

	@Override
	public void accessWebsite(String url) {
		if (Objects.nonNull(url)) {
			if (blockedSites.contains(url.toLowerCase())) {
				throw new AccessRestrictedException("access to site is blocked");
			} else {
				internet.accessWebsite(url);
			}
		}
	}

}
