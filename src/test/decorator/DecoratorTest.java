package test.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		// 创建月饼
		IComponent component = new YueBing();
		// 包装袋 包装月饼
		BagDecorator bagDecorator = new BagDecorator(component);
		// 礼品盒 包装 包装袋的月饼
		BoxDecorator boxDecorator = new BoxDecorator(bagDecorator);
		boxDecorator.show();
		//针对接口编程
		component = new BagDecorator(component);
		component = new BoxDecorator(component);
		component.show();

	}

}
