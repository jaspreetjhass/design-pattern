package com.jp.design.patterns.behavioral.iterator;

public class IteratorClient {
	public static void main(String[] args) {
		final MyCollection myCollection = new MyCollectionImpl();

		Iterator iterator = myCollection.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
