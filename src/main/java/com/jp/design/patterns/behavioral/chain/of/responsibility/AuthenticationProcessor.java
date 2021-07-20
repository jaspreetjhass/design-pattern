package com.jp.design.patterns.behavioral.chain.of.responsibility;

public abstract class AuthenticationProcessor {

	AuthenticationProcessor nextAuthenticationProcessor;

	public AuthenticationProcessor(AuthenticationProcessor authenticationProcessor) {
		this.nextAuthenticationProcessor = authenticationProcessor;
	}

	public abstract boolean isAuthorized(AuthenticationProvider authenticationProvider);

}
