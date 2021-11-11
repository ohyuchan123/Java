package Chap10;
class MadPlay<T>{
	private T vale;
	public T getCal() {
		return vale;
	}
	public void setVal(T vale)
	{
		this.vale=vale;
	}
}
public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MadPlay<String> mp=new MadPlay<>();
	}
}
