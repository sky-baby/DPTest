package test.proxy;

public class Boy implements IPursue {
	private Girl girl;

	public Boy(Girl girl) {
		this.girl = girl;
	}

	@Override
	public void flowers() {
		System.out.println(girl.getName() + "收到鲜花。");

	}

	@Override
	public void dolls() {
		System.out.println(girl.getName() + "收到洋娃娃。");

	}

	@Override
	public void chocolate() {
		System.out.println(girl.getName() + "收到巧克力。");

	}

}
