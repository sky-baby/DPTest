package test.component;
/**
 * 使用数组存储子节点
 * @author sky-baby
 *
 */
public class CompanyB extends Component {
	private String name;
	private double assets;
	private Component[] components = new Component[MAX_ITMES];;
	private int numberOfItems = 0;
	private final static int MAX_ITMES = 100;

	public CompanyB(String name, double assets) {
		this.assets = assets;
		this.name = name;
		components = new Component[MAX_ITMES];
	}

	@Override
	public void addComponent(Component component) {
		if (components == null) {
			components = new Component[MAX_ITMES];
		}
		components[numberOfItems++] = component;
	}

	@Override
	public void removeComponent(Component component) {
		int index = 0;
		for (; index <= numberOfItems; index++) {
			if (component.equals(components[index])) {
				components[index] = null;
				break;
			}
		}
		if (index < numberOfItems) {
			for (; index < numberOfItems;) {
				components[index] = components[++index];
			}
			--numberOfItems;
		} else if (index == numberOfItems) {
			--numberOfItems;
		} else {
			System.out.println(this.getClass().getSimpleName() + "不存在" + component.getName() + "节点");
		}
	}

	@Override
	public Component getChild(int index) {
		if (index < numberOfItems) {
			return components[index];
		} else {
			System.out.println(this.getClass().getSimpleName() + "不存在" + index + "节点");
			return null;
		}
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getAssets() {
		return this.assets;
	}

	@Override
	public void print(int n) {
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < n; i++) {
			str = str.append("--");
		}

		System.out.println(str + "公司名称：" + getName());
		System.out.println(str + "公司资产：" + getAssets());
		for (int i = 0; i < numberOfItems; i++) {
			components[i].print(n+1);
		}
	}

}
