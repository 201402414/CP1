package H1127;

import java.util.Scanner;

class BookTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		Book a = new Book();
		Magazine b = new Magazine();
		System.out.println("Book 클레스 정보입력");
		
		System.out.print("제목 : ");
		a.setName(input.nextLine());
		System.out.print("페이지 : ");
		a.setPage(input.nextInt());
		System.out.print("저자 : ");
		input.nextLine();
		a.setAuthor(input.nextLine());

		
		System.out.println("");
		System.out.println("Magazine 클레스 정보입력");
		System.out.print("제목 : ");
		b.setName(input.nextLine());
		System.out.print("페이지 : ");
		b.setPage(input.nextInt());
		System.out.print("저자 : ");
		input.nextLine();
		b.setAuthor(input.nextLine());
		System.out.print("발매일 : ");
		b.setDate(input.nextLine());
		
		System.out.println("");
		
		System.out.println("Book class 정보출력");
		System.out.println("제목 : " + a.getName());
		System.out.println("페이지 : " + a.getPage());
		System.out.println("저자 : " + a.getAuthor());
		
		System.out.println("");
		
		System.out.println("Book class 정보출력");
		System.out.println("제목 : " + b.getName());
		System.out.println("페이지 : " + b.getPage());
		System.out.println("저자 : " + b.getAuthor());
		System.out.println("발매일 : " + b.getDate());
	}
}

