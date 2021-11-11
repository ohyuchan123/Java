package Chap10;
interface Box1<T>{
	void addItem(T item, int index);
}
class Item3<T> implements Box1<T>{
	private final T[] array;
	public Item3() {
		array=(T[]) new Object[10];
	}
	@Override
	public void addItem(T item,int index) {
		array[index]=item;
	}
	void Print(int index)
	{
		System.out.println(array[index]);
	}
}
public class Test2 {
	public static void main(String[] args) {
		Item3<String> strObject=new Item3<String>();
		strObject.addItem("wow", 0);
		strObject.Print(0);
	}
}
