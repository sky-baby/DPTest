package test.iterator;

public class JaneIterator implements IMyIterator<MenuItem> {
	private MenuItem[] menuItems;
	private int position = 0;

	public JaneIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if (position >= menuItems.length || menuItems[position] == null)
			return false;
		return true;
	}

	@Override
	public MenuItem next() {
		return menuItems[position++];
	}

}
