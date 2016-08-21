package test.iterator;

public class JaneMenu {
	private int numberOfItems = 0;
	private final static int MAX_ITMES = 100;
	protected MenuItem[] menuItems;

	public JaneMenu() {
		menuItems = new MenuItem[MAX_ITMES];
		addMenuItem("炒土豆丝", 2.4f, "东北土豆", true);
		addMenuItem("宫保鸡丁", 4.4f, "微辣", false);
		addMenuItem("番茄鸡蛋汤", 2.0f, "大分量", false);
		addMenuItem("炒时蔬", 1.4f, "时令菜", true);
	}

	private void addMenuItem(String name, float money, String description, boolean vegetarian) {
		if (numberOfItems >= MAX_ITMES) {
			System.out.println("Sorry Jane的菜单已经满了！！！");
		} else {
			menuItems[numberOfItems] = new MenuItem(name, money, description, vegetarian);
			numberOfItems++;
		}

	}

	final public MenuItem[] getMenuItems() {
		return menuItems;
	}

}
