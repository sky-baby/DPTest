package test.factory;
/**
 * 西安手机工厂
 * @author sky-baby
 *
 */
public class XiAnPhoneFactory extends PhoneFactory<XiAnPhoneType> {
	public XiAnPhoneFactory(String name) {
		this.factoryName = name;
	}

	Phone getPhone(XiAnPhoneType type) {
		Phone phone = null;
		switch (type) {
		case XIAOMI:
			phone = new XiaoMiPhone();
			break;
		case VIVO:
			phone = new VivoPhone();
			break;
		case SAMSUNG:
			phone = new SAMSUNGPhone();
			break;
		case IPHONE:
			phone = new ApplePhone();
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