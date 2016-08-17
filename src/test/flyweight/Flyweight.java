package test.flyweight;

public class Flyweight {
	private String name;

	@Override
	public String toString() {
		return "Flyweight [name=" + name + "]";
	}

	public Flyweight(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
