package test.iterator;

import java.util.ArrayList;

public class JackMenu {
	protected ArrayList<MenuItem> menuItems;

	public JackMenu() {
		menuItems = new ArrayList<>();
		addMenuItem("牛奶", 0.9f, "低脂牛奶", false);
		addMenuItem("豆浆", 0.7f, "东北大豆", true);
		addMenuItem("皮蛋瘦肉粥", 1.4f, "独家秘制", false);
		addMenuItem("八宝粥", 1.0f, "无糖", true);
		addMenuItem("饮料", 0.4f, "可口可乐", false);
	}

	private void addMenuItem(String name, float money, String description, boolean vegetarian) {
		menuItems.add(new MenuItem(name, money, description, vegetarian));
	}

	final public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}

}
