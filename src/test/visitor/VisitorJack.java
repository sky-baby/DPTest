package test.visitor;

public class VisitorJack implements IVistor {

	@Override
	public void visit(ElementA element) {
		System.out.println(this.getClass().getSimpleName() + "访问了" + element.getClass().getSimpleName());
		element.doSomething();
	}

	@Override
	public void visit(ElementB element) {
		System.out.println(this.getClass().getSimpleName() + "访问了" + element.getClass().getSimpleName());
		element.noCare();

	}

}
