package test.simple.factory;

public class OperationAdd extends Operation {

	@Override
	public int getResult() {
		return getX() * +getY();
	}

}
