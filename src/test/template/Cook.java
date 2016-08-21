package test.template;

public abstract class Cook {
	protected String name;
	/**
	 * final修饰 防止子类修改其内部的实现过程
	 */
	final public void Process() {
		System.out.println(name+"的烹制步骤如下：");
		step1();
		material();
		step2();
		cook();
		container();

	}

	/**
	 * 材料
	 */
	abstract protected void material();

	/**
	 * 烹制方式
	 */
	abstract protected void cook();

	/**
	 * 容器
	 */
	abstract protected void container();

	/**
	 * 使用private修饰 表示 这一步是固定了不能修改。
	 */
	private void step1() {
		System.out.println("刷洗炊具");
	}

	/**
	 * 使用protected修饰 表示 这一步是可以使用默认的方式，也可以自己重新定义。
	 * 食材处理过程
	 */
	protected void step2() {
		System.out.println("冷水洗菜，切丝");
	}

}
