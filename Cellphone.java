package Chap06;

public class Cellphone {
	//��Ʈ(�Ӽ�)
	String model;
	String color;
	
	//������
	
	public Cellphone(String model, String color) {
		this.color=color;
		this.model=model;
	}
	//�޼���
	void powerOn(){
		System.out.println("������ �մϴ�.");
	}
	void powerOff(){
		System.out.println("������ ���ϴ�.");
	}
	void bell(){
		System.out.println("���� �︳�ϴ�");
	}
	void reciveVoice(String msg) {
		System.out.println("���� "+msg);
	}
	void sendVoice(String msg) {
		System.out.println("�ڱ� "+msg);
	}
	void hangUP() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}

