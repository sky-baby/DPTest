package test.state;

public class SoldOutState implements IState {

	@Override
	public void insertMoney() {
		System.out.println("由于物品已经售完，不能进行投币操作。");

	}

	@Override
	public void turn() {
		System.out.println("不能转动曲柄，物品已经售完~~~");

	}

	@Override
	public void refund() {
		System.out.println("你不能进行退币操作，因为你没有投币！！");

	}

	@Override
	public void dispense() {
		System.out.println("物品已经售完~~~");

	}

}
