package GuanChaZhe_1;

public class Test {

	public static void main(String[] args) {
		//秘书美眉
		Secretary mm = new Secretary();
		
		//看股票的同事
		StockObserver tongshi1 = new StockObserver("德华", mm);
		StockObserver tongshi2 = new StockObserver("朝伟", mm);
		
		//秘书记下两位同事
		mm.attach(tongshi1);
		mm.attach(tongshi2);
		
		//发现老板回来
		mm.setAction("老板回来了");
		
		//通知两个同事
		mm.notifyObsevers();
	}
}
