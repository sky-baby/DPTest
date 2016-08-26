package test.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		Factory factoryXs = new FactoryXs("Xs工厂");
		Factory factoryPx = new FactoryPx("Px工厂");
		
		Phone phone = factoryPx.createPhone();
		phone.show();
		Computer computer = factoryXs.createComputer();
		computer.display();

	}

}
