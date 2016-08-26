package test.abstractfactory;
/**
 * Px系列工厂
 * @author sky-baby
 *
 */
public class FactoryPx extends Factory {
	public FactoryPx(String name) {
		this.factoryName = name;
	}

	public Phone createPhone() {
		return new PhonePx();
	}

	@Override
	public Computer createComputer() {
		return new ComputerPx();
	}

}
