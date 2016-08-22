package test.component;

public class ComponentTest {

	public static void main(String[] args) {
		Component c = new CompanyA("总公司", 122222);
		Component a1 = new CompanyA("A1公司", 112);
		Component a2 = new CompanyA("A2公司", 120);
		Component a3 = new CompanyA("A3公司", 12);

		Component b1 = new CompanyB("B1公司", 312);
		Component b2 = new CompanyB("B2公司", 102);
		Component b3 = new CompanyB("B3公司", 123);
		Component b4 = new CompanyB("B4公司", 122);
		Component b5 = new CompanyB("B5公司", 222);

		Component d1 = new Department("D1部门", "D1描述", 12);
		Component d2 = new Department("D2部门", "D2描述", 7);
		Component d3 = new Department("D3部门", "D3描述", 2);
		Component d4 = new Department("D4部门", "D4描述", 5);
		// 总公司下直属分公司A1,A2,B2,B4
		c.addComponent(a1);
		c.addComponent(a2);
		c.addComponent(b2);
		c.addComponent(b4);
		c.addComponent(b5);
		// A2下属分公司B1,B3
		a2.addComponent(b1);
		a2.addComponent(b3);
		// B2下属分公司A3
		b2.addComponent(a3);

		a3.addComponent(d1);
		a3.addComponent(d2);
		a3.addComponent(d3);

		b2.addComponent(d4);
		b2.addComponent(d3);
		b2.addComponent(d1);

		b4.addComponent(d4);

		c.print(0);
		c.removeComponent(b2);
		c.print(0);

	}

}
