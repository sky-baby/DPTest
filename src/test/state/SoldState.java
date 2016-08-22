package test.state;

public class SoldState implements IState {
	private Machine machine;

	public SoldState(Machine machine) {
		this.machine = machine;
	}

	@Override
	public void insertMoney() {
		System.out.println("请等待，正在为你准备物品。");

	}

	@Override
	public void turn() {
		System.out.println("多次转动曲柄不会获得额外的物品！！！");

	}

	@Override
	public void refund() {
		System.out.println("很抱歉，你已经转动曲柄了！！！");

	}

	@Override
	public void dispense() {
		machine.release();
		if (machine.getCount() > 0) {
			machine.setState(machine.getNoMoneyState());
		} else {
			System.out.println("机器内的物品已经售完~~~");
			machine.setState(machine.getSoldOutState());
		}

	}

}
