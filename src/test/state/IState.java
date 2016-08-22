package test.state;

public interface IState {
	/**
	 * 投币
	 */
	void insertMoney();
	/**
	 * 旋转曲柄
	 */
	void turn();
	/**
	 * 退币
	 */
	void refund();
	/**
	 * 发放物品
	 */
	void dispense();
	
}
