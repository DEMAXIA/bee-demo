package com.bee.singleton;

/**
 * 单例设计模式
 * 
 * @author Anni
 *
 */
public class Singleton {
	// private static Singleton instance = new Singleton();

	private static Singleton instance;

	private Singleton() {
	}

	// public static Singleton getInstance() {
	// return instance;
	// }

	/**
	 * 懒汉式
	 * 
	 * @return
	 */
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public void showMsg() {
		System.out.println("singleton...");
	}
}
