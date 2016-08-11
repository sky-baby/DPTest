package test.observer;

public class Manager implements Observer {
	private String name;

	public Manager(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void notify(EventType event) {

		accept();
		if (EventType.BOSS == event) {
			care();
		} else {
			noCare();
		}

	}

	private void accept() {
		System.out.println(this.name + ":收到了通知");
	}

	private void care() {
		System.out.println(this.name + ":Boss来了，我要好好工作了");
	}

	private void noCare() {
		System.out.println(this.name + ":Boss没来，我不怕");
	}

}
