package test.singleton;

public class Singleton3 {
	private static Singleton3 instance;

	private Singleton3() {

	}

	static {
		// 懒加载
		System.out.println("instance==null:" + (instance == null));
	}

	// 线程安全
	public static Singleton3 getInstance() {
		if (instance == null) {
			synchronized (Singleton3.class) {
				if (instance == null) {
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}
	//效率不高
	public static synchronized Singleton3 getInstance1() {
		if (instance == null) {
			instance = new Singleton3();
		}
		return instance;
	}
	//效率不高
	public static Singleton3 getInstance2() {
		synchronized (Singleton3.class) {
			if (instance == null) {
				instance = new Singleton3();
			}
		}
		return instance;
	}

}
