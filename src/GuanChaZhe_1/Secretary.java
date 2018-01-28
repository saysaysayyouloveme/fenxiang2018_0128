package GuanChaZhe_1;

import java.util.ArrayList;
import java.util.List;

//秘书类
public class Secretary {

	//同事列表
	private List<StockObserver> obsevers = new ArrayList<StockObserver>();
	
	private String action;
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	//增加
	public void attach(StockObserver obsever) {
		obsevers.add(obsever);
	}
	
	//移除
	public void deattach(StockObserver obsever) {
		obsevers.remove(obsever);
	}
	
	//通知
	public void notifyObsevers() {
		for (StockObserver stockObserver : obsevers) {
			stockObserver.update();
		}
	}
}
