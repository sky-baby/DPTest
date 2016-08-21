package test.iterator;

import java.util.ArrayList;

public class IteratorTest {

	public static void main(String[] args) {
		JackMenu jack = new JackMenu();
		JaneMenu jane = new JaneMenu();
		ArrayList<MenuItem> jackMenuItems = jack.getMenuItems();
		MenuItem[] janeMenuItems = jane.getMenuItems();
		printJackMenus(jackMenuItems);
		printJaneMenus(janeMenuItems);

		JackNewMenu jackNew = new JackNewMenu();
		JaneNewMenu janeNew = new JaneNewMenu();
		IMyIterator<MenuItem> jackNewIterator = jackNew.createIterator();
		IMyIterator<MenuItem> janeNewIterator = janeNew.createIterator();
		printMents(jackNewIterator);
		printMents(janeNewIterator);

	}

	/**
	 * 公用的遍历方法
	 * 
	 * @param jackNewIterator
	 */
	private static void printMents(IMyIterator<MenuItem> jackNewIterator) {
		while (jackNewIterator.hasNext()) {
			System.out.println(jackNewIterator.next());
		}
	}

	/**
	 * 针对数组的遍历方法
	 * 
	 * @param janeMenuItems
	 */
	private static void printJaneMenus(MenuItem[] janeMenuItems) {
		for (int i = 0, len = janeMenuItems.length; i < len; i++) {
			MenuItem item = janeMenuItems[i];
			if (item == null) {
				break;
			}
			System.out.println(item.toString());
			item = null;
		}
	}

	/**
	 * 针对ArrayList的遍历方式
	 * 
	 * @param jackMenuItems
	 */
	private static void printJackMenus(ArrayList<MenuItem> jackMenuItems) {
		for (int i = 0, len = jackMenuItems.size(); i < len; i++) {
			MenuItem item = jackMenuItems.get(i);
			System.out.println(item.toString());
			item = null;
		}
	}

}
