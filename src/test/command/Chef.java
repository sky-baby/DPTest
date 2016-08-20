package test.command;

/**
 * 厨师
 * 
 * @author sky-baby
 *
 */
public class Chef {
	private String name;

	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void cookEgg() {
		System.out.println(getName() + "炒鸡蛋了");
	}

	public void cookPork() {
		System.out.println(getName() + "炒红烧肉了");
	}

}
