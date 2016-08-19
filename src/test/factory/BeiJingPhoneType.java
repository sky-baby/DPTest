package test.factory;

/**
 * 拉萨工厂提供的手机清单
 * 
 * @author sky-baby
 *
 */
public enum BeiJingPhoneType {
	XIAOMI(0), VIVO(1), SAMSUNG(2),IPHONE(3),HUAWEI(4),OPPO(5);
	private int id;

	private BeiJingPhoneType(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
