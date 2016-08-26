package test.abstractfactory;

public abstract class Computer {
	/**
	 * 系类名称
	 */
	private String seriesName;

	public String getSeriesName() {
		return seriesName;
	}

	protected void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public void display(){
		System.out.println("我是："+seriesName+" 系列的电脑。");
	}

}
