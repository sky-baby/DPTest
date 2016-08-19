package test.factory;

public class HuaWeiPhone extends Phone {

	@Override
	public void show() {
		System.out.println("我是华为手机:storeName=" + getStoreName() + "  factoryName=" + getFactoryName() + "厂家生产的");

	}

}
