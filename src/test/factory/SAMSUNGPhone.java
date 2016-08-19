package test.factory;

public class SAMSUNGPhone extends Phone {

	@Override
	public void show() {
		System.out.println("我是SAMSUNG手机:storeName=" + getStoreName() + "  factoryName=" + getFactoryName() + "厂家生产的");

	}

}
