package test.chain;

public class SmallMsgHandle extends MsgHandle {

	@Override
	void handle(RequestMessage requestMessage) {
		if (MsgType.SMALL == requestMessage.getMsgType()) {
			selfHandle(requestMessage);
		} else if (msgHandle != null) {
			parentHandle(requestMessage);
			msgHandle.handle(requestMessage);
		} else {
			passHandle(requestMessage);
		}

	}

}
