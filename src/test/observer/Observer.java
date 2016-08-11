package test.observer;

public interface Observer {
	void notify(EventType event);

	String getName();

}
