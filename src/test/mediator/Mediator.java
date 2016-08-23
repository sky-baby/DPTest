package test.mediator;

public interface Mediator {
	void send(Colleague fromColleague, String message);

	void sign(Colleague fromColleague, Colleague toColleague, String message);
}
