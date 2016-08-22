package test.state;

import java.util.Random;

public class HasMoneyState implements IState {
	private Random random = new Random(System.currentTimeMillis());
	private Machine machine;

	public HasMoneyState(Machine machine) {
		this.machine = machine;
	}

	@Override
	public void insertMoney() {
		System.out.println("一次只能投币一枚！！！");

	}

	@Override
	public void turn() {
		System.out.println("你已经转动曲柄了。。。");
		// 10%中奖概率
		int winner = random.nextInt(10);
		if (winner == 0 && machine.getCount() > 1) {
			machine.setState(machine.getWinnerOutState());
		} else {

			machine.setState(machine.getSoldState());
		}

	}

	@Override
	public void refund() {
		System.out.println("你的硬币已经退回！！！");
		machine.setState(machine.getNoMoneyState());

	}

	@Override
	public void dispense() {
		System.out.println("请转动曲柄或者选择退币。");

	}

}
