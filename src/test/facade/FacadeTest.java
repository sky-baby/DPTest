package test.facade;

public class FacadeTest {
	/**
	 * 外观模式的好处：对外只有暴露相关方法，使用者不比关心内部是如何实现的
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建一个全能对象的实例
		Facade facade = new Facade();
		// 内部由DoctorA实现
		facade.surgical();
		// 内部由Nurse实现
		facade.rounds();
		// 内部由DoctorB实现
		facade.dentistry();
		// 内部由DoctorA和DoctorB共同实现
		facade.surgery();

	}

}
