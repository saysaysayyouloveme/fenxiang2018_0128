package muban_2;

public abstract class TestPaper {
	public void testQuestion() {
		System.out.println("下列哪个是最好用的IDE？a.Eclipse;b.idea;c.notePad++;d.记事本");
		System.out.println("答案："+answer());
	}
	public abstract String answer();
}
