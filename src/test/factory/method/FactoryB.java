package test.factory.method;

public class FactoryB implements IFactory {

	@Override
	public Product createProduct() {
		System.out.println("我是：" + this.getClass().getSimpleName());
		return new ProductB();
	}

}
