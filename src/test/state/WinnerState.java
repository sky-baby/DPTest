package test.state;

public class WinnerState implements IState {
	private Machine machine;

	public WinnerState(Machine machine) {
		this.machine = machine;
	}

	@Override
	public void insertMoney() {
		System.err.println("不可执行执行投币操作！！！");

	}

	@Override
	public void turn() {
		System.err.println("不可执行执行转动曲柄操作！！！");

	}

	@Override
	public void refund() {
		System.err.println("不可执行执行退币操作！！！");

	}

	@Override
	public void dispense() {
		System.out.println("Winner，额外获得一个物品~~~");
		machine.release();
		if (machine.getCount() == 0) {
			machine.setState(machine.getSoldOutState());
		} else {
			machine.release();
			if (machine.getCount() > 0) {
				machine.setState(machine.getNoMoneyState());
			} else {
				System.out.println("机器内的物品已经售完~~~");
				machine.setState(machine.getSoldOutState());
			}
		}

	}

}
