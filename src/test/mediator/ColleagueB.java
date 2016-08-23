package test.mediator;

public class ColleagueB extends Colleague {

	public ColleagueB(Mediator mediator) {
		super(mediator);
	}

	public void send(String message) {
		System.out.println(getClass().getSimpleName() + "发送的信息：" + message);
		mediator.send(this, message);
	}

	@Override
	public void notify(String message) {
		System.out.println(getClass().getSimpleName() + "获取到信息：" + message);
	}

}
