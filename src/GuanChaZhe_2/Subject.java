package GuanChaZhe_2;

public interface Subject {
	void attach(Observer observer);
	void deacttach(Observer observer);
	void notifyObserver();
	
	public String getAction();
	public void setAction(String action) ;
}
