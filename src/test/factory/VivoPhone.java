package test.factory;

public class VivoPhone extends Phone {

	@Override
	public void show() {
		System.out.println("我是Vivo手机:storeName=" + getStoreName() + "  factoryName=" + getFactoryName() + "厂家生产的");

	}

}
