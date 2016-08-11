package test.singleton;

public class Singleton4 {

	private Singleton4() {

	}

	public static Singleton4 getInstance() {
		return SingletonHolder.instance;
	}

	private static class SingletonHolder {
		/**
		 * 静态初始化器，由JVM来保证线程安全
		 */
		private static Singleton4 instance = new Singleton4();
		static {
			//Singleton 被加载的时候 如果不调用getInstance方法，则SingletonHolder也不会创建，实现懒加载
			System.out.println("SingletonHolder.instance create");
		}
	}

	public static String test() {
		return "test";
	}
	private String str;
	public Singleton4(String str){
		this.str = str;
	}
	public String getStr() {
		return this.str;
	}

}
