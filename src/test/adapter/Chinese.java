package test.adapter;
/**
 * Target（客户期待的接口或者类）
 * @author sky-baby
 *
 */
public class Chinese {
	private String name;

	public Chinese(String name) {
		this.name = name;
	}

	void sayNiHao() {
		System.out.println(this.name + " say:你好");

	}

}
