package test.visitor;

/**
 * 访问者接口
 * 
 * @author sky-baby
 *
 */
public interface IVistor {
	/**
	 * 访问者访问ElementA
	 */
	void visit(ElementA element);

	/**
	 * 访问者访问ElementB
	 */
	void visit(ElementB element);

}
