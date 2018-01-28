package GuanChaZhe_1;

//看股票的同事类
public class StockObserver {

	private String name;
	private Secretary sub;
	
	public StockObserver(String name, Secretary sub) {
		super();
		this.name = name;
		this.sub = sub;
	}
	
	public void update() {
		System.out.println(name + "," + sub.getAction() + ",关掉股票行情，继续工作！");
	}
}
