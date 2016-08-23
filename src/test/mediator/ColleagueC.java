package test.mediator;

public class ColleagueC extends Colleague {

	public ColleagueC(Mediator mediator) {
		super(mediator);
	}

	public void push(String message) {
		System.out.println(getClass().getSimpleName() + "发送的信息：" + message);
		mediator.send(this, message);
	}

	public void talk(Colleague colleague, String message) {
		System.out.println(getClass().getSimpleName() + "私聊" + colleague.getClass().getSimpleName() + "：" + message);
	}

	@Override
	public void notify(String message) {
		System.out.println(getClass().getSimpleName() + "获取到信息：" + message);
	}

}
