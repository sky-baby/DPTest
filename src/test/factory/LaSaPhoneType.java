package test.factory;

/**
 * 拉萨工厂提供的手机清单
 * 
 * @author sky-baby
 *
 */
public enum LaSaPhoneType {
	XIAOMI(0), VIVO(1), SAMSUNG(2);
	private int id;

	private LaSaPhoneType(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
