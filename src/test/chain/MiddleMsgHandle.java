package test.chain;

public class MiddleMsgHandle extends MsgHandle {

	@Override
	void handle(RequestMessage requestMessage) {
		if (MsgType.MIDDLE.getId() >= requestMessage.getMsgType().getId()) {
			selfHandle(requestMessage);
		} else if (msgHandle != null) {
			parentHandle(requestMessage);
			msgHandle.handle(requestMessage);
		} else {
			passHandle(requestMessage);
		}

	}

}
