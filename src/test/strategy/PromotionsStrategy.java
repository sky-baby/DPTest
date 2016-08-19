package test.strategy;

public class PromotionsStrategy implements IStrategy {

	@Override
	public double discount(double price) {
		System.out.println("促销活动---打7.5折");
		return price * 0.75;
	}

}
