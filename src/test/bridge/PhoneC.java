package test.bridge;

/**
 * C手机无自带Soft 可以运行已安装的软件，但是不能安装RAM > 15 的 soft
 * 
 * @author sky-baby
 *
 */
public class PhoneC extends Phone {

	@Override
	public void run(String softName) {
		ISoft soft = getSofts().get(softName);
		if (soft == null) {
			System.out.println("手机不存在该软件，无法运行！！！");
			return;
		} else {
			soft.run();
		}
	}

	@Override
	public void addSoft(String softName, ISoft soft) {

		if (soft.getRam() > 15) {
			System.out.println("我不能安装RAM大于15的软件");
		} else {

			super.addSoft(softName, soft);
		}
	}

	public PhoneC() {

	}

}
