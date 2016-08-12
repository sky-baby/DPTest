package test.prototype;

public class Company implements Cloneable {
	private String name;
	private String address;
	private People1 people;

	public Company(String name, String address, People1 people) {
		super();
		this.name = name;
		this.address = address;
		this.people = people;
	}

	public String getName() {
		return name;
	}

	public People1 getPeople() {
		return people;
	}

	public void setPeople(People1 people) {
		this.people = people;
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
		return "Company [name=" + name + ", address=" + address + ", people=" + people + "]";
	}

	@Override
	protected Company clone() throws CloneNotSupportedException {
		Company company = null;
		try {
			company = (Company) super.clone();
			company.setPeople((People1) this.people.clone());
			return company;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

}
