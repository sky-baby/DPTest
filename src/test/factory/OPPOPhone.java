package test.factory;

public class OPPOPhone extends Phone {

	@Override
	public void show() {
		System.out.println("我是OPPO手机:storeName=" + getStoreName() + "  factoryName=" + getFactoryName() + "厂家生产的");

	}

}
