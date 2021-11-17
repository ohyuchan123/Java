package Chap07;
interface country{
	public abstract void capital();
}
class USA implements country{
	@Override
	public void capital() {
		System.out.println("워싱턴 D.C");
	}
	public void Tourist_destination() {
		System.out.println("골든게이트교");
	}
}
class Korea implements country{
	@Override
	public void capital() {
		System.out.println("서울");
	}
	public void River() {
		System.out.println("한강");
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
