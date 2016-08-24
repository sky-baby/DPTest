package test.visitor;

public class ElementB extends Element {

	@Override
	public void accept(IVistor vistor) {
		vistor.visit(this);
	}
	public void happy(){
		System.out.println("我很happy");
	}
	public void noCare(){
		System.out.println("我don't care");
	}

}
