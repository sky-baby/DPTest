package test.visitor;

public abstract class Element {
	/**
	 * 抽象被访问的元素
	 * @param vistor
	 */
	abstract public void accept(IVistor vistor);

}
