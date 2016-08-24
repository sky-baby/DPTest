package test.visitor;

public class VistorTest {

	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		//只针对Visitor进行扩展
		objectStructure.accept(new VisitorJane());
		objectStructure.accept(new VisitorJack());

	}

}
