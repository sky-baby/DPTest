package test.mediator;

public class ColleagueMediator implements Mediator {
	//由于我把Colleague中定义了abstract notify(String message),所以这里可以使用List或者Colleague声明。
	private ColleagueA ca;
	private ColleagueB cb;
	private ColleagueC cc;

	public void setCa(ColleagueA ca) {
		this.ca = ca;
	}

	public void setCb(ColleagueB cb) {
		this.cb = cb;
	}

	public void setCc(ColleagueC cc) {
		this.cc = cc;
	}

	/**
	 * P2All-self
	 */
	@Override
	public void send(Colleague colleague, String message) {
		//如果是用List声明的与该中介者连接的对象可以用foreach直接遍历-self
		if (colleague == ca) {
			cb.notify(message);
			cc.notify(message);
		}
		if (colleague == cb) {
			ca.notify(message);
			cc.notify(message);
		}
		if (colleague == cc) {
			ca.notify(message);
			cb.notify(message);
		}

	}

	/**
	 * P2P
	 */
	@Override
	public void sign(Colleague fromColleague, Colleague toColleague, String message) {
		toColleague.notify(message);
	}

}
