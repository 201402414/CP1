package H1127;

import java.util.Scanner;

class PersonTest{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Person aa = new Person();
		Customer bb = new Customer();
		System.out.println("Person class �����Է�");
		System.out.print("�̸��� �Է� : ");
		aa.setName(input.nextLine());
		System.out.print("�ּҸ� �Է� : ");
		aa.setAdress(input.nextLine());
		System.out.print("��ȭ��ȣ�� �Է� : ");
		aa.setTell(input.nextLine());
		
		System.out.println("");
		
		System.out.println("Customer class �����Է�");
		System.out.print("�̸��� �Է� : ");
		bb.setName(input.nextLine());
		System.out.print("�ּҸ� �Է� : ");
		bb.setAdress(input.nextLine());
		System.out.print("��ȭ��ȣ�� �Է� : ");
		bb.setTell(input.nextLine());
		System.out.print("����ȣ�� �Է� : ");
		bb.setcode(input.nextLine());
		System.out.print("���ϸ����� �Է� : ");
		bb.setMile(input.nextLine());
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("-------------������<Person>---------");
		System.out.println("�� �̸� : " + aa.getName());
		System.out.println("�� �ּ� : " + aa.getAdress());
		System.out.println("�� ��ȭ��ȣ : " + aa.GetTell());

		
		System.out.println("-------------������<Customer>-------");
		System.out.println("�� �̸� : " + bb.getName());
		System.out.println("�� �ּ� : " + bb.getAdress());
		System.out.println("�� ��ȭ��ȣ : " + bb.GetTell());
		System.out.println("����ȣ : " + bb.getcode());
		System.out.println("���ϸ��� : " + bb.getMile());
		
	}
}
