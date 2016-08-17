package test.chain;

public abstract class MsgHandle {
	protected MsgHandle msgHandle;

	public void setMsgHandle(MsgHandle msgHandle) {
		this.msgHandle = msgHandle;
	}

	abstract void handle(RequestMessage requestMessage);

	/**
	 * 自己处理
	 * 
	 * @param requestMessage
	 */
	protected void selfHandle(RequestMessage requestMessage) {
		System.out.println(this.getClass().getSimpleName() + "--处理了--" + requestMessage.getName() + "--的--"
				+ requestMessage.getMsgType().getDescription() + "--请求--");

	}

	/**
	 * 自己处理不了，请上级处理
	 * 
	 * @param requestMessage
	 */
	protected void parentHandle(RequestMessage requestMessage) {
		System.out.println(this.getClass().getSimpleName() + "--处理不了--" + requestMessage.getName() + "--的--"
				+ requestMessage.getMsgType().getDescription() + "--请求，交给自己的上级--" + msgHandle.getClass().getSimpleName()
				+ "--进行处理。");
	}

	/**
	 * 自己处理不了，并且上级不在，问题搁置（不做任何响应）
	 * 
	 * @param requestMessage
	 */
	protected void passHandle(RequestMessage requestMessage) {
		System.out.println(this.getClass().getSimpleName() + "--处理不了--" + requestMessage.getName() + "--的--"
				+ requestMessage.getMsgType().getDescription()+ "--请求，同时上级又不在，所以消息在--" + this.getClass().getSimpleName()
				+ "--进行搁置处理。");
	}

}
