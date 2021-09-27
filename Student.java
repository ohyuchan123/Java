package Chap06;

public class Student extends People{
	int hakbun;
	public Student(String name,int ssn,int hakbun) {
		super(name, ssn);
		this.hakbun=hakbun;
	}
	//메서드 오버라이딩
	void fall() {
		System.out.println("나는 사람이면서 학생입니다.");
	}
}
