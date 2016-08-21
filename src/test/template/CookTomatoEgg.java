package test.template;

public class CookTomatoEgg extends Cook {
	public CookTomatoEgg() {
		this.name = "番茄炒蛋";
	}

	@Override
	protected void material() {
		System.out.println("食材：鸡蛋，番茄，调味品");

	}

	@Override
	protected void cook() {
		System.out.println("先炒鸡蛋至半熟，加入番茄炒至番茄出汁，加调味品出锅。");

	}

	@Override
	protected void container() {
		System.out.println("装入圆瓷盘子内");

	}

	// 自定义食材处理过程
	@Override
	protected void step2() {
		System.out.println("凉水洗西红柿，鸡蛋敲碎搅拌。");
	}

}
