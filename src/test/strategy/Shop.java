package test.strategy;

public class Shop {
	private IStrategy strategy;

	public Shop() {

	}

	/**
	 * 设置活动策略
	 * 
	 * @param strategy
	 */
	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

	public Shop(IStrategy strategy) {
		super();
		this.strategy = strategy;
	}

	/**
	 * 活动
	 * 
	 * @param price
	 * @return
	 */
	public double activity(double price) {
		if (strategy == null) {
			return price;
		}
		return strategy.discount(price);
	}

}
