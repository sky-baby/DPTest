package test.factory;

public class PhoneStore {
	PhoneFactory phoneFactory = new PhoneFactory();

	IPhone sell(PhoneType type) {
		return phoneFactory.getPhone(type);
	}

}
