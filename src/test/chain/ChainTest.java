package test.chain;

public class ChainTest {
	public static void main(String[] args) {
		RequestMessage smallRequestMsg = new RequestMessage("xiao li", MsgType.SMALL);
		RequestMessage middleRequestMsg = new RequestMessage("xiao zhang", MsgType.MIDDLE);
		RequestMessage largeRequestMsg = new RequestMessage("xiao wang", MsgType.LARGE);
		RequestMessage largerRequestMsg = new RequestMessage("xiao qiang", MsgType.LARGER);
		RequestMessage errorRequestMsg = new RequestMessage("zhao ri tian", MsgType.ERROR);

		SmallMsgHandle smallMsgHandle = new SmallMsgHandle();
		MiddleMsgHandle middleMsgHandle = new MiddleMsgHandle();
		LargeMsgHandle largeMsgHandle = new LargeMsgHandle();
		LargerMsgHandle largerMsgHandle = new LargerMsgHandle();
		System.out.println("SmallMsgHandle只能处理半天的请假");
		smallMsgHandle.handle(smallRequestMsg);
		smallMsgHandle.handle(middleRequestMsg);
		System.out.println("SmallMsgHandle设置了MiddleMsgHandle上级");
		smallMsgHandle.setMsgHandle(middleMsgHandle);
		smallMsgHandle.handle(middleRequestMsg);
		System.out.println("MiddleMsgHandle只能处理一天以内的请假，同时未设置上级");
		smallMsgHandle.handle(largeRequestMsg);
		System.out.println("MiddleMsgHandle只能处理一天以内的请假，同时设置LargerMsgHandle");
		middleMsgHandle.setMsgHandle(largerMsgHandle);
		smallMsgHandle.handle(largeRequestMsg);
		System.out.println("SmallMsgHandle未设置了LargerMsgHandle上级，但是MiddleMsgHandle设置了，责任的传递性");
		smallMsgHandle.handle(largerRequestMsg);
		System.out.println("MiddleMsgHandle只能处理三天以内的请假，直接处理。");
		largeMsgHandle.handle(smallRequestMsg);
		
		System.out.println("谁都处理不了的问题，SmallMsgHandle接收后一级一级向上汇报");
		smallMsgHandle.handle(errorRequestMsg);
		System.out.println("谁都处理不了的问题，LargerMsgHandle接收后，由于自己不是最高级别且最高级不在，所以问题也将进行搁置");
		largeMsgHandle.handle(errorRequestMsg);

	}
}
