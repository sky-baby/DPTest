package test.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton1 singleton1 = Singleton1.getInstance();
		System.out.println("singleton1==Singleton1.getInstance():" + (singleton1 == Singleton1.getInstance()));

		Singleton2 singleton2 = Singleton2.getInstance();
		System.out.println("singleton2==Singleton2.getInstance():" + (singleton2 == Singleton2.getInstance()));

		Singleton3 singleton30 = Singleton3.getInstance();
		long start0 = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			singleton30 = Singleton3.getInstance();
		}
		long end0 = System.currentTimeMillis();
		System.out.println("singleton30 create time:" + (end0 - start0));
		System.out.println("singleton30==Singleton3.getInstance():" + (singleton30 == Singleton3.getInstance()));
		
		Singleton3 singleton31 = Singleton3.getInstance1();
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			singleton31 = Singleton3.getInstance1();
		}
		long end1 = System.currentTimeMillis();
		System.out.println("singleton31 create time:" + (end1 - start1));
		System.out.println("singleton31==Singleton3.getInstance1():" + (singleton31 == Singleton3.getInstance1()));
		
		Singleton3 singleton32 = Singleton3.getInstance2();
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			singleton32 = Singleton3.getInstance2();
		}
		long end2 = System.currentTimeMillis();
		System.out.println("singleton32 create time:" + (end2 - start2));
		System.out.println("singleton32==Singleton3.getInstance2():" + (singleton32 == Singleton3.getInstance2()));
		
		System.out.println(Singleton4.test());
		Singleton4 test = new Singleton4("未调用getInstance（），故SingletonHolder.instance没有创建");
		System.out.println(test.getStr());
		Singleton4 singleton4 = Singleton4.getInstance();
		System.out.println("singleton4==test:" + (singleton4 == test));
		System.out.println("singleton4==Singleton4.getInstance():" + (singleton4 == Singleton4.getInstance()));

	}

}
