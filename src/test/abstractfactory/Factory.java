package test.abstractfactory;

public abstract class Factory {
	protected String factoryName;

	/**
	 * 创建手机
	 * 
	 * @param type
	 * @return
	 */
	abstract public Phone createPhone();

	/**
	 * 创建电脑
	 * 
	 * @return
	 */
	abstract public Computer createComputer();

	public String getFactoryName() {
		return factoryName;
	}

}
