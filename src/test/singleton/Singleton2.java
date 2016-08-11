package test.singleton;

public class Singleton2 {
	private static Singleton2 instance = new Singleton2();

	private Singleton2() {

	}

	static {
		//没有懒加载效果，基于classLoader机制避免了多线程的同步问题
		System.out.println("instance==null:" + (instance == null));
	}

	public static Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}

}
