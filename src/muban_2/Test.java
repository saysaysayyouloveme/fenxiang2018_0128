package muban_2;

import muban_2.TestPaperA;
import muban_2.TestPaperB;

public class Test {
	public static void main(String[] args) {
		System.out.println("ѧ���׳����Ծ�");
		TestPaper testPaperA = new TestPaperA();
		testPaperA.testQuestion();
		
		System.out.println("ѧ���ҳ����Ծ�");
		TestPaper testPaperB = new TestPaperB();
		testPaperB.testQuestion();
	}

}
