package test.factory;

@SuppressWarnings("unchecked")
public class FactoryTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		PhoneStore phoneStore = new ChainPhoneStore<>();
		PhoneFactory<XiAnPhoneType> xiAnPhoneFactory = new XiAnPhoneFactory("西安");
		PhoneFactory<LaSaPhoneType> laSaPhoneFactory = new LaSaPhoneFactory("拉萨");
		PhoneFactory<BeiJingPhoneType> beiJingPhoneFactory = new BeijingPhoneFactory("北京");
		
		Phone phone = null;
		phoneStore.setStoreName("小明手机连锁店");
		phoneStore.setPhoneFactory(xiAnPhoneFactory);
		phone = phoneStore.sell(XiAnPhoneType.XIAOMI);
		phone.show();
		phone = phoneStore.sell(XiAnPhoneType.IPHONE);
		phone.show();
		
		phoneStore.setStoreName("小赵手机连锁店");
		phoneStore.setPhoneFactory(beiJingPhoneFactory);
		phone = phoneStore.sell(BeiJingPhoneType.VIVO);
		phone.show();
		phone = phoneStore.sell(BeiJingPhoneType.OPPO);
		phone.show();
		phone = phoneStore.sell(BeiJingPhoneType.XIAOMI);
		phone.show();
		
		phoneStore.setPhoneFactory(laSaPhoneFactory);
		phone = phoneStore.sell(LaSaPhoneType.SAMSUNG);
		phone.show();
		phone = phoneStore.sell(LaSaPhoneType.XIAOMI);
		phone.show();

	}

}
