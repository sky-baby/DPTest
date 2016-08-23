package test.mediator;

public class MediatorTest {

	public static void main(String[] args) {
		ColleagueMediator mediator = new ColleagueMediator();
		ColleagueA ca = new ColleagueA(mediator);
		ColleagueB cb = new ColleagueB(mediator);
		ColleagueC cc = new ColleagueC(mediator);
		mediator.setCa(ca);
		mediator.setCb(cb);
		mediator.setCc(cc);
		ca.post("我是ColleagueA");
		cb.send("我是ColleagueB");
		cc.push("我是ColleagueC");
		System.out.println("-------------");
		ca.speak(cb, "ColleagueB，你好。我是ColleagueA~");
		cc.talk(ca, "ColleagueA，干啥呢?");
	}

}
