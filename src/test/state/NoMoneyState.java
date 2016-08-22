package test.state;
/**
 * 没有投币的状态
 * @author sky-baby
 *
 */
public class NoMoneyState implements IState {
	private Machine machine;

	public NoMoneyState(Machine machine) {
		this.machine = machine;
	}

	@Override
	public void insertMoney() {
		System.out.println("已经完成投币");
		machine.setState(machine.getHasMoneyState());

	}

	@Override
	public void turn() {
		System.out.println("曲柄已经扭动，但是你没有投币！！！");

	}

	@Override
	public void refund() {
		System.out.println("你没有投过币！！！");

	}

	@Override
	public void dispense() {
		System.out.println("你需要先投币！！！");

	}

}
