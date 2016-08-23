package test.mediator;

public class ColleagueA extends Colleague {

	public ColleagueA(Mediator mediator) {
		super(mediator);
	}

	public void post(String message) {
		System.out.println(getClass().getSimpleName() + "发送的信息：" + message);
		mediator.send(this, message);
	}

	public void speak(Colleague colleague, String message) {
		System.out
				.println(getClass().getSimpleName() + "给" + colleague.getClass().getSimpleName() + "说的悄悄话：" + message);
	}

	@Override
	public void notify(String message) {
		System.out.println(getClass().getSimpleName() + "获取到信息：" + message);
	}

}
