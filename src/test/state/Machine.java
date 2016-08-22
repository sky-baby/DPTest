package test.state;

public class Machine {
	private IState hasMoneyState;
	private IState noMoneyState;
	private IState soldState;
	private IState soldOutState;
	private IState winnerOutState;

	private IState state = soldOutState;
	private int count = 0;

	public Machine(int count) {
		hasMoneyState = new HasMoneyState(this);
		noMoneyState = new NoMoneyState(this);
		soldState = new SoldState(this);
		winnerOutState = new WinnerState(this);
		soldOutState = new SoldOutState();
		this.count = count;
		if (count > 0) {
			state = noMoneyState;
		}
	}

	public IState getWinnerOutState() {
		return winnerOutState;
	}

	public IState getHasMoneyState() {
		return hasMoneyState;
	}

	public IState getNoMoneyState() {
		return noMoneyState;
	}

	public IState getSoldState() {
		return soldState;
	}

	public IState getSoldOutState() {
		return soldOutState;
	}

	public void setState(IState state) {
		this.state = state;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
		if (count > 0) {
			state = noMoneyState;
		}
	}

	public void insertMoney() {
		state.insertMoney();
	}

	public void turn() {
		state.turn();
		state.dispense();
	}

	public void refund() {
		state.refund();
	}

	public void release() {
		System.out.println("物品已经发出，请及时取走。");
		if (count != 0) {
			count--;
		}

	}

}
