package Chap06;

public class DmCellPhoneTest {
	public static void main(String[] args) {
		DmCellPhone dm=new DmCellPhone("�ڹ���","����",10);
		
		System.out.println(dm.model);
		System.out.println(dm.color);
		System.out.println(dm.channel);
		
		dm.powerOn();
		dm.bell();
		dm.sendVoice("��������.");
		dm.reciveVoice("�ȳ��ϼ���~ ���� ���õ��Դϴ�.");
		dm.sendVoice("��~ �� �ݰ����ϴ�.");
		dm.hangUP();
		
		dm.turnOnDmb();
		dm.changeChannel(12);
		dm.turnOffDmb();
	}
}
