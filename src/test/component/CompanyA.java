package test.component;

import java.util.ArrayList;
/**
 * 使用List存储子节点
 * @author sky-baby
 *
 */
public class CompanyA extends Component {
	private String name;
	private double assets;
	private ArrayList<Component> components;

	public CompanyA(String name, double assets) {
		this.assets = assets;
		this.name = name;
		components = new ArrayList<>();
	}

	@Override
	public void addComponent(Component component) {
		if (components == null) {
			components = new ArrayList<>();
		}
		components.add(component);
	}

	@Override
	public void removeComponent(Component component) {
		if (components.contains(component)) {
			components.remove(component);
		} else {
			System.out.println(this.getClass().getSimpleName() + "不存在" + component.getName() + "节点");
		}
	}

	@Override
	public Component getChild(int index) {
		if (index < components.size()) {
			return components.get(index);
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
		for (Component component : components) {
			component.print(n+1);
		}
	}

}
