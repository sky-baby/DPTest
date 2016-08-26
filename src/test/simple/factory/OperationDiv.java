package test.simple.factory;

public class OperationDiv extends Operation {

	@Override
	public int getResult() {
		if (getY() == 0) {
			System.out.println("0不可以做除数！！！");
			return 0;
		}
		return getX() / getY();
	}

}
