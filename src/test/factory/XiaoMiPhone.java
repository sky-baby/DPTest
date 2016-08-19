package test.factory;

public class XiaoMiPhone extends Phone {

	@Override
	public void show() {
		System.out.println("我是小米手机:storeName=" + getStoreName() + "  factoryName=" + getFactoryName() + "厂家生产的");

	}

}
