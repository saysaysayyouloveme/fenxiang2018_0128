package GuanChaZhe_2;

public class StockObsever extends Observer{

	public StockObsever(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update() {
		System.out.println(name + "," + sub.getAction() + ",�رչ�Ʊ���飬����������");
	}

}
