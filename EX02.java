package Chap07;
interface Pay{
	public void payment();
}
class CardPay implements Pay{
	@Override
	public void payment() {
		System.out.println("ī��");
	}
}
class CashPay implements Pay{
	@Override
	public void payment() {
		System.out.println("����");
	}
}
class PaymentService{
	Pay pay;
	private final String Credit_card="ī�����";
	private final String Cash="���ݰ���";
	
	public void process(String option) {
		if(option.equals(Credit_card)) {
			pay=new CardPay();
		}else if(option.equals(Cash)) {
			pay=new CashPay();
		}
		pay.payment();
	}
}
public class EX02 {
	public static void main(String[] args) {
		PaymentService a=new PaymentService();
		a.process("ī�����");
	}
}
