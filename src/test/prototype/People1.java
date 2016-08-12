package test.prototype;

public class People1 implements Cloneable{
	private String name;
	private int age;

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public People1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	protected People1 clone() throws CloneNotSupportedException {
		return (People1)super.clone();
	}

}
