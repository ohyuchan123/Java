package Chap07;
interface country{
	public abstract void capital();
}
class USA implements country{
	@Override
	public void capital() {
		System.out.println("������ D.C");
	}
	public void Tourist_destination() {
		System.out.println("������Ʈ��");
	}
}
class Korea implements country{
	@Override
	public void capital() {
		System.out.println("����");
	}
	public void River() {
		System.out.println("�Ѱ�");
	}
}
public class Ex06 {
	public static void main(String[] args) {
		USA a = new USA();
		Korea b= new Korea();
		a.capital();
		a.Tourist_destination();
		b.capital();
		b.River();
	}
}
