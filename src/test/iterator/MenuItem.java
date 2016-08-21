package test.iterator;

/**
 * 遍历的对象
 * 
 * @author sky-baby
 *
 */
public class MenuItem {
	private String name;
	private float money;
	private String description;
	private boolean vegetarian;

	public MenuItem(String name, float money, String description, boolean vegetarian) {
		super();
		this.name = name;
		this.money = money;
		this.description = description;
		this.vegetarian = vegetarian;
	}

	public String getName() {
		return name;
	}

	public float getMoney() {
		return money;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", money=" + money + ", description=" + description + ", vegetarian="
				+ vegetarian + "]";
	}

}
