package test.flyweight;

public class FlyweightTest {

	public static void main(String[] args) {
		Flyweight f1 = new Flyweight("a");
		Flyweight f2 = new Flyweight("a");
		System.out.println("f1==f2:" + (f1 == f2));
		System.out.println("f1.hashCode():" + f1.hashCode());
		System.out.println("f2.hashCode():" + f2.hashCode());
		FlyweightFactory ff = new FlyweightFactory();
		Flyweight f3 = ff.getFlyweight("a");
		Flyweight f4 = ff.getFlyweight("a");
		System.out.println("f3==f4:" + (f3 == f4));
		System.out.println("f3:" + f3.hashCode());
		System.out.println("f4:" + f4.hashCode());
		Flyweight f5 = ff.getFlyweight("g");
		System.out.println(f5);

	}

}
