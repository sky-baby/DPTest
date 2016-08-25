package test.memento;

import java.util.Date;

public class MementoTest {

	public static void main(String[] args) {
		Originator originator = new Originator();
		MyState oldState = new MyState("first message", new Date());
		originator.setState(oldState);
		originator.show();
		
		Caretaker caretaker = new Caretaker();
		caretaker.setMenemto(originator.createMenemto());
		
		MyState newState = new MyState("second message", new Date());
		originator.setState(newState);
		originator.show();
		
		originator.setMenemto(caretaker.getMenemto());
		originator.show();

	}

}
