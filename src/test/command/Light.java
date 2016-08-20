package test.command;

public class Light {
	private String name;

	public Light(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void on() {
		System.out.println(getName() + "打开了");
	}

	public void off() {
		System.out.println(getName() + "关闭了");

	}
}
