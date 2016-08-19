package test.factory;

/**
 * 手机
 * 
 * @author sky-baby
 *
 */
public abstract class Phone {
	protected String storeName;
	protected String factoryName;

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

	public String getStoreName() {
		return storeName;
	}

	public String getFactoryName() {
		return factoryName;
	}

	abstract void show();

}
