package test.factory;
/**
 * 拉萨手机工厂
 * @author sky-baby
 *
 */
public class LaSaPhoneFactory extends PhoneFactory<LaSaPhoneType> {
	public LaSaPhoneFactory(String name) {
		this.factoryName = name;
	}

	Phone getPhone(LaSaPhoneType type) {
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

		default:
			break;
		}
		if(phone!=null){
			phone.setFactoryName(getFactoryName());
		}
		return phone;
	}

}
