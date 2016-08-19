package test.factory;

/**
 * 连锁手机店总店，不卖手机，只开设连锁分店（abstract 不可创建实例）
 * 
 * @author sky-baby
 *
 */
public abstract class PhoneStore<T> {
	protected Phone phone;
	/**
	 * 加盟店 点名
	 */
	protected String storeName;
	/**
	 * 加盟店 手机的来源渠道
	 */
	protected PhoneFactory<T> phoneFactory;

	/**
	 * 卖手机
	 * 
	 * @param type 这里我用的是enum类型
	 * @return
	 */
	abstract Phone sell(T type);

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public PhoneFactory<T> getPhoneFactory() {
		return phoneFactory;
	}

	public void setPhoneFactory(PhoneFactory<T> phoneFactory) {
		this.phoneFactory = phoneFactory;
	}

}
