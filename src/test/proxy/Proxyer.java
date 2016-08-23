package test.proxy;

public class Proxyer implements IPursue {
	private IPursue pursue;

	public Proxyer(Girl girl) {
		pursue = new Boy(girl);
	}

	@Override
	public void flowers() {
		pursue.flowers();

	}

	@Override
	public void dolls() {
		pursue.dolls();

	}

	@Override
	public void chocolate() {
		pursue.chocolate();

	}

}
