package test.factory;

public class PhoneFactory {
	IPhone getPhone(PhoneType type) {
		IPhone phone = null;
		switch (type) {
		case XIAOMI:
			phone = new XiaoMiPhone();
			break;
		case HUAWEI:
			phone = new HuaWeiPhone();
			break;
		case IPHONE:
			phone = new ApplePhone();
			break;
		case SAMSUNG:
			phone = new SAMSUNGPhone();
			break;

		default:
			break;
		}
		return phone;
	}

}
