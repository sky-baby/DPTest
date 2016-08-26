package test.simple.factory;

public class OperationFactory {

	public static Operation createOperation(char type) {
		Operation operation = null;
		switch (type) {
		case '+':
			operation = new OperationAdd();
			break;
		case '-':
			operation = new OperationSub();
			break;
		case '*':
			operation = new OperationMul();
			break;
		case '/':
			operation = new OperationDiv();
			break;

		default:
			break;
		}
		return operation;
	}

}
