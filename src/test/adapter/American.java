package test.adapter;
/**
 * Adaptee（第三方提供的类即需要被适配的类）
 * @author sky-baby
 *
 */
public class American {
	private String name;

	public American(String name) {
		this.name = name;
	}

	void sayHello() {
		System.out.println(this.name + " say:hello");

	}

}
