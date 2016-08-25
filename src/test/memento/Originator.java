package test.memento;
/**
 * 发起者
 * @author sky-baby
 *
 */
public class Originator {
	/**
	 * 需要保存的状态
	 */
	private MyState state;

	public void setState(MyState state) {
		this.state = state;
	}

	/**
	 * 创建备忘录，将当前state的属性导入并实例化一个menemto
	 * 
	 * @return
	 */
	public Menemto createMenemto() {
		return new Menemto(state);
	}

	public void setMenemto(Menemto menemto) {
		this.state = menemto.getState();
	}

	public void show() {
		System.out.println(this.getClass().getSimpleName() + "--state:" + state);
	}

}
