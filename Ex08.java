package problem;

public class Ex08 {
	public static void main(String[] args) {
		Food chicken=new Food("ġŲ",18000);
		Food pizza=new Food("����",28000);
		Food sushi=new Food("�ʹ似Ʈ",22000);
		Food[] foods= {chicken,pizza,sushi};
		for(int i=0;i<foods.length;i++)
		{
			foods[i].print();
		}
	}
}
class Food{
	String food;
	int price;
	public Food(String food, int price) {
		this.food=food;
		this.price=price;
	}
	void print() {
		System.out.println("name : "+food+", price : "+price);
	}
}
