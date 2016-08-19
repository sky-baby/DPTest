package test.factory;
/**
 * 西安手机工厂
 * @author sky-baby
 *
 */
public class BeijingPhoneFactory extends PhoneFactory<BeiJingPhoneType> {
	public BeijingPhoneFactory(String name) {
		this.factoryName = name;
	}

	Phone getPhone(BeiJingPhoneType type) {
		Phone phone = null;
		switch (type) {
		case XIAOMI:
			phone = new XiaoMiPhone();
			break;
		case VIVO:
			phone = new VivoPhone();
			break;
		case IPHONE:
			phone = new ApplePhone();
			break;
		case SAMSUNG:
			phone = new SAMSUNGPhone();
			break;
		case OPPO:
			phone = new OPPOPhone();
			break;
		case HUAWEI:
			phone = new HuaWeiPhone();
			break;

		default:
			break;
		}
		if(phone!=null){
			phone.setFactoryName(getFactoryName());
		}
		return phone;
	}

}
