package Chap06;

public class StudentTest {

	public static void main(String[] args) {
		Student st=new Student("������",123456,1209);
		Student st1=new Student("�赵��",123456,1201);
		System.out.println("�̸� : "+st.name+"\n�й� : "+st.hakbun+"\nssn : "+st.ssn);
		System.out.println("�̸� : "+st1.name+"\n�й� : "+st1.hakbun+"\nssn : "+st1.ssn);
		st.fall();
	}

}
