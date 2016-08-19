package test.factory;

public class ApplePhone extends Phone {

	@Override
	public void show() {
		System.out.println("我是Apple手机:storeName=" + getStoreName() + "  factoryName=" + getFactoryName()+"厂家生产的");

	}

}
