package GuanChaZhe_2;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject{

	String action;
	
	//同事列表
	private List<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void deacttach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public String getAction() {
		return action;
	}

	@Override
	public void setAction(String action) {
		this.action = action;
	}

}
