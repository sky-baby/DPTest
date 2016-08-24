package test.visitor;

public class ElementA extends Element {

	@Override
	public void accept(IVistor vistor) {
		vistor.visit(this);
	}
	public void doSomething(){
		System.out.println("我是ElementA，这是我自己方法doSomething()");
	}

}
