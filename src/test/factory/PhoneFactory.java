package test.factory;

public abstract class PhoneFactory<T> {
	protected String factoryName;
	abstract Phone getPhone(T type);
	public String getFactoryName() {
		return factoryName;
	}

}
