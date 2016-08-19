package test.strategy;

public class StrategyTest {

	public static void main(String[] args) {
		IStrategy fullCut = new FullCutStrategy();
		IStrategy promotion = new PromotionsStrategy();
		Shop fullCutActivity = new Shop(fullCut);
		Shop promotionActivity = new Shop(promotion);
		System.out.println("促销活动进行中......");
		System.out.println("小明购买了589元的商品,实际付款："+promotionActivity.activity(589)+"元");
		System.out.println("满减活动进行中......");
		System.out.println("小王购买了589元的商品,实际付款："+fullCutActivity.activity(589)+"元");
		System.out.println("小李购买了1589元的商品,实际付款："+fullCutActivity.activity(1589)+"元");
		System.out.println("小刘购买了2589元的商品,实际付款："+fullCutActivity.activity(2589)+"元");
		System.out.println("小宋购买了1189元的商品,实际付款："+fullCutActivity.activity(1189)+"元");
		//另一种实现
		Shop shop = new Shop();
		System.out.println("没有活动的情况下");
		System.out.println("小赵购买了589元的商品,实际付款："+shop.activity(589)+"元");
		shop.setStrategy(promotion);
		System.out.println("促销活动进行中......");
		System.out.println("小明购买了589元的商品,实际付款："+shop.activity(589)+"元");
		shop.setStrategy(fullCut);
		System.out.println("满减活动进行中......");
		System.out.println("小王购买了589元的商品,实际付款："+shop.activity(589)+"元");
		System.out.println("小李购买了1589元的商品,实际付款："+shop.activity(1589)+"元");
		System.out.println("小刘购买了2589元的商品,实际付款："+shop.activity(2589)+"元");
		System.out.println("小宋购买了1189元的商品,实际付款："+shop.activity(1189)+"元");
		
	}

}
