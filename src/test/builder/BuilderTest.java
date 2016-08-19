package test.builder;

public class BuilderTest {

	public static void main(String[] args) {
		// 创建 试卷指导者
		ExamPaperDirector examPaperDirector = new ExamPaperDirector();
		// 指导者 指导创建2010年试卷
		ExamPaper examPaper2010 = examPaperDirector.buildExamPaper(new Builder2010());
		System.out.println("2010年试卷--选择题内容：" + examPaper2010.getChoice());
		// 指导者 指导创建2016年试卷
		ExamPaper examPaper2016 = examPaperDirector.buildExamPaper(new Builder2016());
		System.out.println("2016年试卷内容：" + examPaper2016.toString());
	}
}
