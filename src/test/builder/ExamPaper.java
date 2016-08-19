package test.builder;

public class ExamPaper {

	private String Choice;
	private String fillInTheBlank;
	private String judegment;
	private String QA;

	@Override
	public String toString() {
		return "ExamPaper [Choice=" + Choice + ", fillInTheBlank=" + fillInTheBlank + ", judegment=" + judegment
				+ ", QA=" + QA + "]";
	}

	public String getChoice() {
		return Choice;
	}

	public void setChoice(String choice) {
		Choice = choice;
	}

	public String getFillInTheBlank() {
		return fillInTheBlank;
	}

	public void setFillInTheBlank(String fillInTheBlank) {
		this.fillInTheBlank = fillInTheBlank;
	}

	public String getJudegment() {
		return judegment;
	}

	public void setJudegment(String judegment) {
		this.judegment = judegment;
	}

	public String getQA() {
		return QA;
	}

	public void setQA(String qA) {
		QA = qA;
	}

}
