package com.jp.design.patterns.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Singleton implements Serializable {

	private static final long serialVersionUID = 380663043498518845L;

	private static Singleton singleton = null;

	private Singleton() {
	}

	public Object readResolve() {
		return singleton;
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

}

class SingletonExecutor {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());

		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new FileOutputStream(new File("C:\\Users\\hp\\Documents\\serial\\abc.txt")))) {
			objectOutputStream.writeObject(Singleton.getInstance());
		}

		try (ObjectInputStream objectOutputStream = new ObjectInputStream(
				new FileInputStream(new File("C:\\Users\\hp\\Documents\\serial\\abc.txt")))) {
			Singleton s = (Singleton) objectOutputStream.readObject();
			System.out.println(s);
		}

	}
}
