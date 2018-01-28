package muban_2;

import muban_2.TestPaperA;
import muban_2.TestPaperB;

public class Test {
	public static void main(String[] args) {
		System.out.println("学生甲抄的试卷");
		TestPaper testPaperA = new TestPaperA();
		testPaperA.testQuestion();
		
		System.out.println("学生乙抄的试卷");
		TestPaper testPaperB = new TestPaperB();
		testPaperB.testQuestion();
	}

}
