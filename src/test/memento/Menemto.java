package test.memento;

public class Menemto {
	/**
	 * 保存的数据
	 */
	private MyState state;

	public MyState getState() {
		return state;
	}

	public Menemto(MyState state) {
		super();
		this.state = state;
	}

}
