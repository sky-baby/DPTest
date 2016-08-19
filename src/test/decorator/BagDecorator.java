package test.decorator;

public class BagDecorator implements IComponent{
	private IComponent component;

	@Override
	public void show() {
		System.out.println("我是包装袋,开始包装了");
		component.show();
		System.out.println("我是包装袋，包装完了。");
	}
	public BagDecorator(IComponent component){
		this.component = component;
	}

}
