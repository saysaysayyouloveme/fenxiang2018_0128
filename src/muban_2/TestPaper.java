package muban_2;

public abstract class TestPaper {
	public void testQuestion() {
		System.out.println("�����ĸ�������õ�IDE��a.Eclipse;b.idea;c.notePad++;d.���±�");
		System.out.println("�𰸣�"+answer());
	}
	public abstract String answer();
}
