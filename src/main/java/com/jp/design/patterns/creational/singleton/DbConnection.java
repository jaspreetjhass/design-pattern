package com.jp.design.patterns.creational.singleton;

public enum DbConnection {

	INSTANCE;

}

class DbConnectionExecutor {
	public static void main(String[] args) {

		System.out.println(DbConnection.INSTANCE.hashCode());
		System.out.println(DbConnection.INSTANCE.hashCode());
		System.out.println(DbConnection.INSTANCE.hashCode());

	}
}
