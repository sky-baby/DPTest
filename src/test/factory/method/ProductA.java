package test.factory.method;

public class ProductA extends Product {

	@Override
	public void display() {
		System.out.println("我是：" + this.getClass().getSimpleName());
		System.out.println("我的名字：" + getName());
	}

}
