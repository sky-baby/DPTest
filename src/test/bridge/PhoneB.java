package test.bridge;

/**
 * B手机无自带Soft 可以安装任何软件，但是不能运行RAM > 20 的 soft
 * 
 * @author sky-baby
 *
 */
public class PhoneB extends Phone {

	@Override
	public void run(String softName) {
		ISoft soft = getSofts().get(softName);
		if(soft==null){
			System.out.println("手机不存在该软件，无法运行！！！");
			return ;
		}
		if(soft.getRam()>20){
			System.out.println("我不能运行RAM大于20的软件");
		}else{
			soft.run();
		}
	}

	public PhoneB() {
		
	}

}
