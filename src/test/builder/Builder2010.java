package test.builder;

public class Builder2010 implements IBuilder {
	private ExamPaper examPaper;

	@Override
	public void buildChoice() {
		examPaper.setChoice("2010年选择题");
	}

	@Override
	public void buildFillInTheBlank() {
		examPaper.setFillInTheBlank("2010年填空题");

	}

	@Override
	public void buildJudgment() {
		examPaper.setJudegment("2010年判断题");

	}

	@Override
	public void buildQA() {
		examPaper.setQA("2010年问答题");

	}

	@Override
	public ExamPaper buildExamPaper() {
		return examPaper;
	}

	public Builder2010() {
		examPaper = new ExamPaper();
	}


}
