package Chap06;

public class StudentTest {

	public static void main(String[] args) {
		Student st=new Student("오유찬",123456,1209);
		Student st1=new Student("김도균",123456,1201);
		System.out.println("이름 : "+st.name+"\n학번 : "+st.hakbun+"\nssn : "+st.ssn);
		System.out.println("이름 : "+st1.name+"\n학번 : "+st1.hakbun+"\nssn : "+st1.ssn);
		st.fall();
	}

}
