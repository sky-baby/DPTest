package test.simple.factory;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		Operation operation = OperationFactory.createOperation('-');
		operation.setX(1);
		operation.setY(3);
		System.out.println(operation.getResult());
		
		operation = OperationFactory.createOperation('*');
		operation.setX(11);
		operation.setY(32);
		System.out.println(operation.getResult());

	}

}
