package com.jp.design.patterns.behavioral.chain.of.responsibility;

public class UsernamePasswordAuthenticationProcessor extends AuthenticationProcessor {

	public UsernamePasswordAuthenticationProcessor(final AuthenticationProcessor authenticationProcessor) {
		super(authenticationProcessor);
	}

	@Override
	public boolean isAuthorized(final AuthenticationProvider authenticationProvider) {
		if (authenticationProvider instanceof InMemoryAuthenticationProvider) {
			System.out.println("authorized by usernamePassword");
			return true;
		} else if (nextAuthenticationProcessor != null) {
			System.out.println("delegating request to OAuth");
			return nextAuthenticationProcessor.isAuthorized(authenticationProvider);
		}
		return false;
	}

}
