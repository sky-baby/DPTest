package test.memento;

import java.io.Serializable;
import java.util.Date;
/**
 * 自定义状态
 * @author sky-baby
 *
 */
public class MyState implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private Date date;

	@Override
	public String toString() {
		return "MyState [message=" + message + ", date=" + date + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public MyState(String message, Date date) {
		super();
		this.message = message;
		this.date = date;
	}

}
