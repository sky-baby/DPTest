package test.chain;

public enum MsgType {
	SMALL("请假半天", 0), MIDDLE("请假一天", 1), LARGE("请假2-3天", 2), LARGER("请假4-5天", 3),ERROR("无限期休假",4);
	private String description;
	private int id;

	private MsgType(String description, int id) {
		this.description = description;
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
