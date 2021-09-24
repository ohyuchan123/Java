package Chap06;

public class AnimalTest {

	public static void main(String[] args) {
		Eagle el=new Eagle();
		el.mouth=1;
		el.wing=2;
		el.eat();
		el.fly();
		el.sleep();
		Tiger ti=new Tiger();
		ti.mouth=2;
		ti.leg=4;
		ti.eat();
		ti.run();
		ti.sleep();
		Goldfish gold=new Goldfish();
		gold.mouth=1;
		gold.fin=5;
		gold.eat();
		gold.swim();
		gold.sleep();
		
	}

}
