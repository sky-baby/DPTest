package test.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Foreground {
	private List<Observer> observers;

	public Foreground() {
		this.observers = new ArrayList<>();
	}

	public void look(EventType event) {
		if (observers != null) {
			Iterator<Observer> iterator = observers.iterator();
			while (iterator.hasNext()) {
				iterator.next().notify(event);
				;
			}
		}
	}

	public void register(Observer observer) {
		if (observers == null) {
			observers = new ArrayList<>();
		}
		if (!observers.contains(observer)) {
			synchronized (observers) {
				if (!observers.contains(observer)) {
					observers.add(observer);
					System.out.println(observer.getName() + "上班了");
					System.out.println("上班人数：" + observers.size());
				}
			}
		}
	}

	public void unRegister(Observer observer) {
		if (observers == null) {
			return;
		}
		if (observers.contains(observer)) {
			synchronized (observers) {
				if (observers.contains(observer)) {
					observers.remove(observer);
					System.out.println(observer.getName() + "下班了");
					System.out.println("上班人数：" + observers.size());
				}
			}
		}

	}

	public void unRegisterAll() {
		if (observers == null) {
			return;
		} else {
			observers.clear();
			System.out.println("全下班了");
			System.out.println("上班人数：" + observers.size());
		}

	}

}
