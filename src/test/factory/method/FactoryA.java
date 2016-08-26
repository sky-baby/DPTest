package test.factory.method;

public class FactoryA implements IFactory {

	@Override
	public Product createProduct() {
		System.out.println("我是：" + this.getClass().getSimpleName());
		return new ProductA();
	}

}
