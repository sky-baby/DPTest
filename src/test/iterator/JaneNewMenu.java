package test.iterator;

public class JaneNewMenu extends JaneMenu implements IMenu<MenuItem> {

	public JaneNewMenu() {
		super();
	}

	@Override
	public IMyIterator<MenuItem> createIterator() {
		return new JaneIterator(menuItems);
	}

}
