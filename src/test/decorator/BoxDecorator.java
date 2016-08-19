package test.decorator;

public class BoxDecorator implements IComponent{
	private IComponent component;

	@Override
	public void show() {
		System.out.println("我是礼品盒,开始包装了");
		component.show();
		System.out.println("我是礼品盒，包装完了。");
	}
	public BoxDecorator(IComponent component){
		this.component = component;
	}

}
