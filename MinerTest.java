package problem;

import java.util.Scanner;

public class MinerTest {
	public static void main(String[] args) {
		Miner mi=new Miner("����");
		Miner mi1=new Miner("�۷θ���");
		mi.mine(3);
		mi1
		.mine(2);
		mi.print();
		mi1.print();
	}
}
class Miner{
	int coin;
	String name;
	public Miner(String name) {
		this.name=name;
	}
	void mine(int coin)
	{
		this.coin=coin;
	}
	public void print() {
		System.out.println("name : "+name+",coins : "+coin);
	}
}

