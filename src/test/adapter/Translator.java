package test.adapter;
/**
 * Adapter（适配器，将第三Adaptee转换成Target）
 * @author sky-baby
 *
 */
public class Translator extends Chinese{
	
	public American american;

	public Translator(String name) {
		super(name);
		american = new American(name);
	}

	@Override
	void sayNiHao() {
		System.out.println("使用American的sayHello表达Chinese的sayNiHao");
		american.sayHello();
	}

}
