package test.abstractfactory;
/**
 * Xs系列工厂
 * @author sky-baby
 *
 */
public class FactoryXs extends Factory {
	public FactoryXs(String name) {
		this.factoryName = name;
	}

	public Phone createPhone() {
		return new PhoneXs();
	}

	@Override
	public Computer createComputer() {
		return new ComputerXs();
	}

}
