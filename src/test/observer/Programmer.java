package test.observer;

public class Programmer implements Observer {
	private String name;

	public Programmer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void notify(EventType event) {

		take();
		if (EventType.TEAM_LEADER == event) {
			work();
		} else {
			play();
		}

	}

	private void take() {
		System.out.println(this.name + ":收到了通知");
	}

	private void work() {
		System.out.println(this.name + ":老大来了，我得工作了");
	}

	private void play() {
		System.out.println(this.name + ":老大没来，我可以偷懒");
	}

}
