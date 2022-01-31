package H1127;

import java.util.Scanner;

class PersonTest{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Person aa = new Person();
		Customer bb = new Customer();
		System.out.println("Person class 정보입력");
		System.out.print("이름을 입력 : ");
		aa.setName(input.nextLine());
		System.out.print("주소를 입력 : ");
		aa.setAdress(input.nextLine());
		System.out.print("전화번호를 입력 : ");
		aa.setTell(input.nextLine());
		
		System.out.println("");
		
		System.out.println("Customer class 정보입력");
		System.out.print("이름을 입력 : ");
		bb.setName(input.nextLine());
		System.out.print("주소를 입력 : ");
		bb.setAdress(input.nextLine());
		System.out.print("전화번호를 입력 : ");
		bb.setTell(input.nextLine());
		System.out.print("고객번호를 입력 : ");
		bb.setcode(input.nextLine());
		System.out.print("마일리지를 입력 : ");
		bb.setMile(input.nextLine());
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("-------------고객정보<Person>---------");
		System.out.println("고객 이름 : " + aa.getName());
		System.out.println("고객 주소 : " + aa.getAdress());
		System.out.println("고객 전화번호 : " + aa.GetTell());

		
		System.out.println("-------------고객정보<Customer>-------");
		System.out.println("고객 이름 : " + bb.getName());
		System.out.println("고객 주소 : " + bb.getAdress());
		System.out.println("고객 전화번호 : " + bb.GetTell());
		System.out.println("고객번호 : " + bb.getcode());
		System.out.println("마일리지 : " + bb.getMile());
		
	}
}
