package GuanChaZhe_1;

//����Ʊ��ͬ����
public class StockObserver {

	private String name;
	private Secretary sub;
	
	public StockObserver(String name, Secretary sub) {
		super();
		this.name = name;
		this.sub = sub;
	}
	
	public void update() {
		System.out.println(name + "," + sub.getAction() + ",�ص���Ʊ���飬����������");
	}
}
