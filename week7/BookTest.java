package H1127;

import java.util.Scanner;

class BookTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		Book a = new Book();
		Magazine b = new Magazine();
		System.out.println("Book Ŭ���� �����Է�");
		
		System.out.print("���� : ");
		a.setName(input.nextLine());
		System.out.print("������ : ");
		a.setPage(input.nextInt());
		System.out.print("���� : ");
		input.nextLine();
		a.setAuthor(input.nextLine());

		
		System.out.println("");
		System.out.println("Magazine Ŭ���� �����Է�");
		System.out.print("���� : ");
		b.setName(input.nextLine());
		System.out.print("������ : ");
		b.setPage(input.nextInt());
		System.out.print("���� : ");
		input.nextLine();
		b.setAuthor(input.nextLine());
		System.out.print("�߸��� : ");
		b.setDate(input.nextLine());
		
		System.out.println("");
		
		System.out.println("Book class �������");
		System.out.println("���� : " + a.getName());
		System.out.println("������ : " + a.getPage());
		System.out.println("���� : " + a.getAuthor());
		
		System.out.println("");
		
		System.out.println("Book class �������");
		System.out.println("���� : " + b.getName());
		System.out.println("������ : " + b.getPage());
		System.out.println("���� : " + b.getAuthor());
		System.out.println("�߸��� : " + b.getDate());
	}
}

