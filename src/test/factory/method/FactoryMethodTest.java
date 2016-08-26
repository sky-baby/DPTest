package test.factory.method;

public class FactoryMethodTest {

	public static void main(String[] args) {
		IFactory factoryA = new FactoryA();
		IFactory factoryB = new FactoryB();
		Product productA =  factoryA.createProduct();
		productA.setName("A---TV");
		productA.display();
		Product productB = factoryB.createProduct();
		productB.setName("B---Phone");
		productB.display();

	}

}
