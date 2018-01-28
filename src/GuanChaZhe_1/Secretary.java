package GuanChaZhe_1;

import java.util.ArrayList;
import java.util.List;

//������
public class Secretary {

	//ͬ���б�
	private List<StockObserver> obsevers = new ArrayList<StockObserver>();
	
	private String action;
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	//����
	public void attach(StockObserver obsever) {
		obsevers.add(obsever);
	}
	
	//�Ƴ�
	public void deattach(StockObserver obsever) {
		obsevers.remove(obsever);
	}
	
	//֪ͨ
	public void notifyObsevers() {
		for (StockObserver stockObserver : obsevers) {
			stockObserver.update();
		}
	}
}
