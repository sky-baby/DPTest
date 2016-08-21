package test.template;

public class CookPotatoFloss extends Cook {
	public CookPotatoFloss() {
		this.name = "炒土豆丝";
	}

	@Override
	protected void material() {
		System.out.println("食材：土豆，调味品");

	}

	@Override
	protected void cook() {
		System.out.println("锅内加油，3分热加入土豆丝，炒至土豆丝变色，加调味品出锅。");

	}

	@Override
	protected void container() {
		System.out.println("装入方形瓷盘子内");

	}

}
