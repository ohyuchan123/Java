package Chap06;

public class DmCellPhoneTest {
	public static void main(String[] args) {
		DmCellPhone dm=new DmCellPhone("자바폰","검정",10);
		
		System.out.println(dm.model);
		System.out.println(dm.color);
		System.out.println(dm.channel);
		
		dm.powerOn();
		dm.bell();
		dm.sendVoice("여보세요.");
		dm.reciveVoice("안녕하세요~ 저는 신택동입니다.");
		dm.sendVoice("아~ 예 반갑습니다.");
		dm.hangUP();
		
		dm.turnOnDmb();
		dm.changeChannel(12);
		dm.turnOffDmb();
	}
}
