package GuanChaZhe_2;

public class NBAObserver extends Observer{

	public NBAObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update() {
		System.out.println(name + "," + sub.getAction() + ",�ر�NBAֱ��������������");
	}

}
