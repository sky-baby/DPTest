package test.factory;

public class ChainPhoneStore<T> extends PhoneStore<T> {

	@Override
	Phone sell(T type) {
		phone = phoneFactory.getPhone(type);
		if (phone != null) {
			phone.setStoreName(getStoreName());
		}

		return phone;
	}

}
