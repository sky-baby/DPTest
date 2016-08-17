package test.chain;

public class LargerMsgHandle extends MsgHandle {

	@Override
	void handle(RequestMessage requestMessage) {
		if (MsgType.LARGER.getId() >= requestMessage.getMsgType().getId()) {
			selfHandle(requestMessage);
		} else {
			System.out.println(this.getClass().getSimpleName() + "--觉得--" + requestMessage.getName() + "--的--"
					+ requestMessage.getMsgType().getDescription() + "--请求太过分了，最终否决了--");
		}

	}

}
