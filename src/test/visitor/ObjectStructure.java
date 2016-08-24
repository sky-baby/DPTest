package test.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 单一职责
 * 
 * @author sky-baby
 *
 */
public class ObjectStructure {
	private List<Element> elements;

	public ObjectStructure() {
		elements = new ArrayList<>();
		elements.add(new ElementA());
		elements.add(new ElementB());

	}

	public void accept(IVistor vistor) {
		for (Element element : elements) {
			element.accept(vistor);
		}
	}

}
