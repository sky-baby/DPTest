package test.factory;

public class FactoryTest {

	public static void main(String[] args) {
		PhoneStore phoneStore = new PhoneStore();
		IPhone phone = null;
		phone = phoneStore.sell(PhoneType.XIAOMI);
		phone.show();
		phone = phoneStore.sell(PhoneType.IPHONE);
		phone.show();

	}

}
