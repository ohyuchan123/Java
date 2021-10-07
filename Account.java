package problem;

public class Account {
	public static void main(String[] args) {
		Account1 a=new Account1("123-45","±èÃ¶¼ö",10000);
		Account1 b=new Account1("567-89","¹Ú¸íÈñ",10000);
		System.out.println(a.getAno()+a.getOwner()+a.getBalance());
		System.out.println(b.getAno()+b.getOwner()+b.getBalance());
		a.transfer(b, 3000);
		System.out.println(a.getAno()+a.getOwner()+a.getBalance());
		System.out.println(b.getAno()+b.getOwner()+b.getBalance());
	}

	public int balance;
}
class Account1{
	private String ano;
	private String owner;
	private int balance;
	public Account1(String ano,String owner,int balance) {
		this.ano=ano;
		this.owner=owner;
		this.balance=balance;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	void transfer(Account1 target,int amount)
	{
		if(amount>balance)
		{
			System.out.println("ÀÜ¾×ÀÌ ¾ø½À´Ï´Ù.");
		}
		else {
			balance-=amount;
			target.balance+=amount;
		}
	}
}
