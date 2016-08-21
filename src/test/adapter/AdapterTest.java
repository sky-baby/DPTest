package test.adapter;

public class AdapterTest {
	public static void main(String[] args) {
		Chinese chinese = new Chinese("小明");
		American american = new American("Jack");
		chinese.sayNiHao();
		american.sayHello();
		chinese = new Translator("小明");
		chinese.sayNiHao();
	}

}
