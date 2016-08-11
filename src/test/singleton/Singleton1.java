package test.singleton;

public class Singleton1 {
	private static Singleton1 instance;

	private Singleton1() {

	}

	static {
		//懒加载
		System.out.println("instance==null:" + (instance == null));
	}
	//线程不安全
	public static Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}

}
