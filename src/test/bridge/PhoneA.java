package test.bridge;

/**
 * A手机自带VideoSoft 可以安装运行任何软件
 * 
 * @author sky-baby
 *
 */
public class PhoneA extends Phone {

	@Override
	public void run(String softName) {
		ISoft soft = getSofts().get(softName);
		if(soft==null){
			System.out.println("手机不存在该软件，无法运行！！！");
			return ;
		}else{
			soft.run();
		}
	}

	public PhoneA() {
		addSoft("video", new VideoSoft());
	}

}
