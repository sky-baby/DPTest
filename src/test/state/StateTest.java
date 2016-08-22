package test.state;

public class StateTest {

	public static void main(String[] args) {
		Machine machine = new Machine(3);
		machine.insertMoney();
		machine.turn();
		machine.insertMoney();
		machine.turn();
		machine.insertMoney();
		machine.turn();
		machine.insertMoney();
		machine.turn();
		machine.setCount(10);
		for (int i = 0; i < 10; i++) {
			machine.insertMoney();
			machine.turn();
		}

	}

}
