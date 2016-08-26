package test.simple.factory;

public class OperationSub extends Operation {

	@Override
	public int getResult() {
		return getX() - getY();
	}

}
