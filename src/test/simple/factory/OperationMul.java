package test.simple.factory;

public class OperationMul extends Operation {

	@Override
	public int getResult() {
		return getX() * getY();
	}

}
