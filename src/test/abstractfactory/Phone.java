package test.abstractfactory;

public abstract class Phone {
	/**
	 * 系列名称
	 */
	private String seriesName;

	public String getSeriesName() {
		return seriesName;
	}

	protected void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public void show(){
		System.out.println("我是："+seriesName+" 系列的手机。");
	}

}
