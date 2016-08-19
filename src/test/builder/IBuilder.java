package test.builder;

public interface IBuilder {
	/**
	 * 创建选择题
	 */
	void buildChoice();

	/**
	 * 创建填空题
	 */
	void buildFillInTheBlank();

	/**
	 * 创建判断题
	 */
	void buildJudgment();

	/**
	 * 创建问答题
	 */
	void buildQA();

	/**
	 * 创建试卷
	 * 
	 * @return
	 */
	ExamPaper buildExamPaper();

}
