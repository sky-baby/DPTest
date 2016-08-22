package test.component;

public class Department extends Component {
	private String name;
	private String description;
	private int num;

	public Department(String name, String description, int num) {
		super();
		this.name = name;
		this.description = description;
		this.num = num;
	}

	@Override
	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return description;
	}

	public int getNum() {
		return num;
	}

	@Override
	public void print(int n) {
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < n; i++) {
			str = str.append("--");
		}

		System.out.println(str + "部门名称：" + getName());
		System.out.println(str + "部门描述：" + getDescription());
		System.out.println(str + "部门员工人数：" + getNum());

	}

}
