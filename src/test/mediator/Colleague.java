package test.mediator;

public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	/**
	 * 定义这个抽象方法，是为了Mediator中sign()方便操作。子类可以自定义如何发送消息。
	 * @param message
	 */
	abstract void notify(String message);

}
