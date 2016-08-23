package test.proxy;

public class ProxyTest {
	public static void main(String[] args) {
		//Girl 相当于 Client
		//IPursue 相当于 IMyService：远程接口
		//Boy 相当于 IMyService的具体实现：远程实现
		//Proxyer 相当于 远程将IMyService进行了注册，并启动了对外的服务
		
		Girl girl = new Girl("Jane");
		//IMyserice service = (IMyService)Naming.lookup("rmi://27.0.0.1/MyServiceImp")
		IPursue proxyer = new Proxyer(girl);
		proxyer.chocolate();
		proxyer.dolls();
		proxyer.flowers();

	}
}
