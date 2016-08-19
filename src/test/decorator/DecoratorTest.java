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
		component = null;
		component = new BoxDecorator(new BagDecorator(new YueBing()));
		component.show();

	}

}
