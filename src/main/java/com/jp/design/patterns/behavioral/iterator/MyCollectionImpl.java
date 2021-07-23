package com.jp.design.patterns.behavioral.iterator;

public class MyCollectionImpl implements MyCollection {

	private String[] array = new String[] { "Jaspreet", "Singh", "Jhass" };

	@Override
	public Iterator iterator() {
		return new ItrImpl();
	}

	private class ItrImpl implements Iterator {

		private int index = 0;

		@Override
		public boolean hasNext() {
			if (index < array.length)
				return true;
			return false;
		}

		@Override
		public Object next() {
			if (hasNext())
				return array[index++];
			return null;
		}

	}

}
