package GuanChaZhe_2;

public class Test {

	public static void main(String[] args) {
		Boss huhansan = new Boss();
		
		StockObsever stockObsever = new StockObsever("德华", huhansan);
		NBAObserver nbaObserver = new NBAObserver("朝伟", huhansan);
		
		huhansan.attach(stockObsever);
		huhansan.attach(nbaObserver);
		
		huhansan.setAction("我胡汉三回来了");
		
		huhansan.notifyObserver();
	}
}
