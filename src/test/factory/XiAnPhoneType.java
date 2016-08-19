package test.factory;

/**
 * 西安工厂提供的手机清单
 * 
 * @author sky-baby
 *
 */
public enum XiAnPhoneType {
	XIAOMI(0), VIVO(1), SAMSUNG(2), IPHONE(3);
	private int id;

	private XiAnPhoneType(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
