package GuanChaZhe_1;

public class Test {

	public static void main(String[] args) {
		//������ü
		Secretary mm = new Secretary();
		
		//����Ʊ��ͬ��
		StockObserver tongshi1 = new StockObserver("�»�", mm);
		StockObserver tongshi2 = new StockObserver("��ΰ", mm);
		
		//���������λͬ��
		mm.attach(tongshi1);
		mm.attach(tongshi2);
		
		//�����ϰ����
		mm.setAction("�ϰ������");
		
		//֪ͨ����ͬ��
		mm.notifyObsevers();
	}
}
