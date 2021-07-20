package com.jp.design.patterns.behavioral.chain.of.responsibility;

public class OAuthProcessor extends AuthenticationProcessor {

	public OAuthProcessor(final AuthenticationProcessor authenticationProcessor) {
		super(authenticationProcessor);
	}

	@Override
	public boolean isAuthorized(final AuthenticationProvider authenticationProvider) {
		if (authenticationProvider instanceof JdbcAuthenticationProvider) {
			System.out.println("authorized by OAuth");
			return true;
		}
		System.out.println("not handler found to authorize the request");
		return false;
	}

}
