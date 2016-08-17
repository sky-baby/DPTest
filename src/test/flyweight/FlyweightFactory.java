package test.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
	private HashMap<String, Flyweight> flyweights;

	public FlyweightFactory() {
		this.flyweights = new HashMap<>();
		flyweights.put("a", new Flyweight("a"));
		flyweights.put("b", new Flyweight("b"));
		flyweights.put("c", new Flyweight("c"));
		flyweights.put("d", new Flyweight("d"));
		flyweights.put("e", new Flyweight("e"));
	}

	public Flyweight getFlyweight(String key) {
		if (!flyweights.containsKey(key)) {
			System.out.println("FlyweightFactory--flyweights不包含" + key + "的Flyweight");
			return null;

		} else {
			System.out.println("已从FlyweightFactory--flyweights中获取" + key + "的Flyweight");
			return flyweights.get(key);
		}
	}

}
