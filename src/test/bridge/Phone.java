package test.bridge;

import java.util.HashMap;
import java.util.Map;

/**
 * 手机
 * 
 * @author sky-baby
 *
 */
public abstract class Phone {
	/**
	 * 手机安装的软件
	 */
	private Map<String, ISoft> softs;

	public void addSoft(String softName, ISoft soft) {
		if (softs == null) {
			softs = new HashMap<String, ISoft>();
		}
		softs.put(softName, soft);
	}

	public Map<String, ISoft> getSofts() {
		return softs;
	}

	abstract public void run(String softName);

}
