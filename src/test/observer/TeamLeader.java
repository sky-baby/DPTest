package test.observer;

public class TeamLeader implements Observer {
	private String name;

	public TeamLeader(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void notify(EventType event) {

		take();
		if (EventType.MANAGER == event) {
			talk();
		} else {
			play();
		}

	}

	private void take() {
		System.out.println(this.name + ":收到了通知");
	}

	private void talk() {
		System.out.println(this.name + ":经理来了，我要汇报工作了");
	}

	private void play() {
		System.out.println(this.name + ":我只归经理管，其他人我不怕");
	}

}
