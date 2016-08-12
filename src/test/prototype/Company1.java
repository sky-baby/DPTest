package test.prototype;

public class Company1 implements Cloneable{
	private String name;
	private String address;
	private People1 people;

	public Company1(String name, String address, People1 people) {
		super();
		this.name = name;
		this.address = address;
		this.people = people;
	}

	public People1 getPeople() {
		return people;
	}

	public void setPeople(People1 people) {
		this.people = people;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Company1 [name=" + name + ", address=" + address + ", people=" + people + "]";
	}

	@Override
	protected Company1 clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Company1) super.clone();
	}

}
