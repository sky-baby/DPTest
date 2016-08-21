package test.iterator;
/**
 * 这里可以不继承，我是为了少写一些代码才继承并且把getMenuItems()设置成了final。
 * @author sky-baby
 *
 */
public class JackNewMenu extends JackMenu implements IMenu<MenuItem> {

	public JackNewMenu() {
		super();
	}

	@Override
	public IMyIterator<MenuItem> createIterator() {
		return new JackIterator(menuItems);
	}

}
