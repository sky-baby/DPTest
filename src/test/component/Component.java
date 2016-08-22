package test.component;

public abstract class Component {

	public int getPeoples() {
		throw new UnsupportedOperationException();
	}

	public void addComponent(Component component) {
		throw new UnsupportedOperationException();
	}

	public void removeComponent(Component component) {
		throw new UnsupportedOperationException();
	}

	public Component getChild(int index) {
		throw new UnsupportedOperationException();
	}

	abstract public String getName();

	public String getDescription() {
		throw new UnsupportedOperationException();
	}

	public double getAssets() {
		throw new UnsupportedOperationException();
	}

	abstract public void print(int n);

}
