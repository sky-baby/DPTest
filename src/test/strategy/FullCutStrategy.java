package test.strategy;

public class FullCutStrategy implements IStrategy {

	@Override
	public double discount(double price) {
		System.out.println("满1000-100，满1500-180，满2000-250");
		if (price >= 2000) {
			return price - 250;
		}
		if (price >= 1500) {
			return price - 180;
		}
		if (price >= 1000) {
			return price - 100;
		}
		return price;
	}

}
