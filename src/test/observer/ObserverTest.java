package test.observer;

public class ObserverTest {
	public static void main(String[] args) {
		Foreground foreground = new Foreground();
		Manager xiaoMing = new Manager("xiao ming");
		TeamLeader xiaoLi = new TeamLeader("xiao li");
		foreground.register(xiaoMing);
		System.out.println("---------------------------");
		foreground.register(xiaoLi);
		System.out.println("---------------------------");
		foreground.look(EventType.BOSS);
		System.out.println("---------------------------");
		Programmer xiaoWang = new Programmer("xiao wang");
		foreground.register(xiaoWang);
		System.out.println("---------------------------");
		foreground.look(EventType.OTHER);
		System.out.println("---------------------------");
		foreground.look(EventType.TEAM_LEADER);
		System.out.println("---------------------------");
		foreground.unRegister(xiaoMing);
		System.out.println("---------------------------");
		foreground.look(EventType.MANAGER);

	}
}
