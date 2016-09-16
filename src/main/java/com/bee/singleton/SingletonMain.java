package com.bee.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.showMsg();
	}
}
