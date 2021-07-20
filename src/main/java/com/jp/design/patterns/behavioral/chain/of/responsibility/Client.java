package com.jp.design.patterns.behavioral.chain.of.responsibility;

public class Client {

	public static void main(final String[] args) {

		final AuthenticationProcessor oauthProcessor = new OAuthProcessor(null);
		final AuthenticationProcessor usernamePasswordProcessor = new UsernamePasswordAuthenticationProcessor(oauthProcessor);
		

		final AuthenticationProvider inMemoryAuthProvider = new InMemoryAuthenticationProvider();
		final AuthenticationProvider jdbcAuthProvider = new JdbcAuthenticationProvider();
		final JpaAuthenticationProvider jpaAuthenticationProvider = new JpaAuthenticationProvider();
		
		//scenario 1 - where provider is authorized by delegating handler
		System.out.println(usernamePasswordProcessor.isAuthorized(jdbcAuthProvider));

		//scenario 2 - where provider is authorized by the first handler in the chain
		System.out.println(usernamePasswordProcessor.isAuthorized(inMemoryAuthProvider));
		
		//scenario 3 - where provider is not authorized by any handler in the chain
		System.out.println(usernamePasswordProcessor.isAuthorized(jpaAuthenticationProvider));
		
	}

}
