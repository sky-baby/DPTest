package test.prototype;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("不做任何处理");
		People p1 = new People("xiao li", 18);
		People p2 = new People("xiao li", 18);
		System.out.println("p1==p2:" + (p1 == p2));
		People p3 = p1;
		System.out.println("p3==p1:" + (p3 == p1));
		System.out.println("create: p3 = p1 ----------------");
		System.out.println(p1.toString());
		System.out.println(p3.toString());

		System.out.println("p3.getName() == p1.getName():" + (p3.getName() == p1.getName()));
		System.out.println("p1.getName().hashCode():" + p1.getName().hashCode());
		System.out.println("p3.getName().hashCode():" + p3.getName().hashCode());
		p1.setName("xiao wang");
		p1.setAge(20);
		System.out.println("name change -----------------");
		System.out.println(p1.toString());
		System.out.println(p3.toString());

		System.out.println("p3.getName() == p1.getName():" + (p3.getName() == p1.getName()));
		System.out.println("p1.getName().hashCode():" + p1.getName().hashCode());
		System.out.println("p3.getName().hashCode():" + p3.getName().hashCode());

		People1 p11 = new People1("xiang zhang", 22);
		System.out.println("实现Cloneable默认不做其他处理");
		Company1 c1 = new Company1("name", "address", p11);
		Company1 c2 = new Company1("name", "address", p11);
		System.out.println("c1==c2:" + (c1 == c2));
		Company1 c3 = c1.clone();
		System.out.println("create: c3 = c1.clone() ---------------");
		System.out.println("c3==c1:" + (c3 == c1));
		System.out.println(c1.toString());
		System.out.println(c3.toString());

		System.out.println("c3.getName() == c1.getName():" + (c3.getName() == c1.getName()));
		System.out.println("c1.getName().hashCode():" + c1.getName().hashCode());
		System.out.println("c3.getName().hashCode():" + c3.getName().hashCode());

		System.out.println("c3.getPeople() == c1.getPeople():" + (c3.getPeople() == c1.getPeople()));
		System.out.println("c1.getPeople().hashCode():" + c1.getPeople().hashCode());
		System.out.println("c3.getPeople().hashCode():" + c3.getPeople().hashCode());
		c1.setName("xiao zhao");
		p11.setAge(29);
		System.out.println("name change ----------------");
		System.out.println(c1.toString());
		System.out.println(c3.toString());

		System.out.println("c3.getName() == c1.getName():" + (c3.getName() == c1.getName()));
		System.out.println("c1.getName().hashCode():" + c1.getName().hashCode());
		System.out.println("c3.getName().hashCode():" + c3.getName().hashCode());

		System.out.println("c3.getPeople() == c1.getPeople():" + (c3.getPeople() == c1.getPeople()));
		System.out.println("c1.getPeople().hashCode():" + c1.getPeople().hashCode());
		System.out.println("c3.getPeople().hashCode():" + c3.getPeople().hashCode());

		System.out.println("实现Cloneable,处理非基础类型");
		Company cc1 = new Company("name", "address", p11);
		Company cc2 = new Company("name", "address", p11);
		System.out.println("cc1==cc2:" + (cc1 == cc2));
		Company cc3 = cc1.clone();
		System.out.println("create: cc3 = cc1.clone() ---------------");
		System.out.println("cc3==cc1:" + (cc3 == cc1));
		System.out.println(cc1.toString());
		System.out.println(cc3.toString());
		System.out.println("cc3.getPeople() == cc1.getPeople():" + (cc3.getPeople() == cc1.getPeople()));
		System.out.println("c1.getPeople().hashCode():" + cc1.getPeople().hashCode());
		System.out.println("c3.getPeople().hashCode():" + cc3.getPeople().hashCode());
		System.out.println("name change ----------------");
		cc1.setName("name change");
		p11.setAge(20);
		System.out.println(cc1.toString());
		System.out.println(cc3.toString());
		System.out.println("cc3.getPeople() == cc1.getPeople():" + (cc3.getPeople() == cc1.getPeople()));
		System.out.println("c1.getPeople().hashCode():" + cc1.getPeople().hashCode());
		System.out.println("c3.getPeople().hashCode():" + cc3.getPeople().hashCode());

	}

}
