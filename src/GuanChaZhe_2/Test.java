package GuanChaZhe_2;

public class Test {

	public static void main(String[] args) {
		Boss huhansan = new Boss();
		
		StockObsever stockObsever = new StockObsever("�»�", huhansan);
		NBAObserver nbaObserver = new NBAObserver("��ΰ", huhansan);
		
		huhansan.attach(stockObsever);
		huhansan.attach(nbaObserver);
		
		huhansan.setAction("�Һ�����������");
		
		huhansan.notifyObserver();
	}
}
