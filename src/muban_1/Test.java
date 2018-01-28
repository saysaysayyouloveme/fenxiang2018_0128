package muban_1;

public class Test {
	public static void main(String[] args) {
		System.out.println("学生甲抄的试卷");
		TestPaperA testPaperA = new TestPaperA();
		testPaperA.testQuestion();

		System.out.println("学生乙抄的试卷");
		TestPaperB testPaperB = new TestPaperB();
		testPaperB.testQuestion();
	}

}
