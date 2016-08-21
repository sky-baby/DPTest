package test.iterator;

import java.util.ArrayList;

public class JackIterator implements IMyIterator<MenuItem> {
	private ArrayList<MenuItem> menuItems;
	private int position = 0;

	public JackIterator(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if (position >= menuItems.size() || menuItems.get(position) == null)
			return false;
		return true;
	}

	@Override
	public MenuItem next() {
		return menuItems.get(position++);
	}

}
