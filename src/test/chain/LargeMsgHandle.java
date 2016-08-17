package test.chain;

public class LargeMsgHandle extends MsgHandle {

	@Override
	void handle(RequestMessage requestMessage) {
		if (MsgType.LARGE.getId() >= requestMessage.getMsgType().getId()) {
			selfHandle(requestMessage);
		} else if (msgHandle != null) {
			parentHandle(requestMessage);
			msgHandle.handle(requestMessage);
		} else {
			passHandle(requestMessage);
		}

	}

}
