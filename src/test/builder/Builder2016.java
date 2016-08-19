package test.builder;

public class Builder2016 implements IBuilder {
	private ExamPaper examPaper;

	@Override
	public void buildChoice() {
		examPaper.setChoice("2016年选择题");
	}

	@Override
	public void buildFillInTheBlank() {
		examPaper.setFillInTheBlank("2016年填空题");

	}

	@Override
	public void buildJudgment() {
		examPaper.setJudegment("2016年判断题");

	}

	@Override
	public void buildQA() {
		examPaper.setQA("2016年问答题");

	}

	@Override
	public ExamPaper buildExamPaper() {
		return examPaper;
	}

	public Builder2016() {
		examPaper = new ExamPaper();
	}


}
