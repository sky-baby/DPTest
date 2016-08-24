package test.visitor;

/**
 * 一个具体的访问者
 *
 * @author sky-baby
 *
 */
public class VisitorJane implements IVistor {

	@Override
	public void visit(ElementA element) {
		System.out.println(element.getClass().getSimpleName() + "元素对" + this.getClass().getSimpleName() + "访问者的举动：");
		element.doSomething();
	}

	@Override
	public void visit(ElementB element) {
		System.out.println(element.getClass().getSimpleName() + "元素对" + this.getClass().getSimpleName() + "访问者的举动：");
		element.happy();
	}

}
