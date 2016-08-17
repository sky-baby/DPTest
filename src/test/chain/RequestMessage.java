package test.chain;

public class RequestMessage {
	private String name;
	private MsgType msgType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MsgType getMsgType() {
		return msgType;
	}

	public void setMsgType(MsgType msgType) {
		this.msgType = msgType;
	}

	public RequestMessage(String name, MsgType msgType) {
		super();
		this.name = name;
		this.msgType = msgType;
	}

	@Override
	public String toString() {
		return "RequestMessage [name=" + name + ", msgType=" + msgType + "]";
	}

}
