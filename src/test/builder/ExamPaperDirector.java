package test.builder;

/**
 * 指导者
 * 
 * @author sky-baby
 *
 */
public class ExamPaperDirector {

	public ExamPaper buildExamPaper(IBuilder builder) {
		builder.buildChoice();
		builder.buildFillInTheBlank();
		builder.buildJudgment();
		builder.buildQA();
		return builder.buildExamPaper();
	}

}
