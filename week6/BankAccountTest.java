package H1112;
import java.util.Scanner;
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		
		BankAccount t1 = new BankAccount();
		BankAccount t2 = new BankAccount();
		System.out.println("����1 ���� �Է�");
		System.out.print("���� ��ȣ :");
		t1.accountNumber = input.nextLine();
		System.out.print("������ :");
		t1.owner = input.nextLine();
		System.out.print("�ʱ� �ܾ� : ");
		t1.balance = input.nextInt();
		
		System.out.println("");
		
		System.out.println("����2 ���� �Է�");
		System.out.print("���� ��ȣ :");
		t2.accountNumber = input.nextLine();
		t2.accountNumber = input.nextLine();
		System.out.print("������ :");
		t2.owner = input.nextLine();
		System.out.print("�ʱ� �ܾ� : ");
		t2.balance = input.nextInt();
		
		System.out.println("");
		
		System.out.print("����1���� ����2�� �۱��� �ݾ� : ");
		a = input.nextInt();
		t1.sendAccount(a, t2);
		
		if(t1.balance+1 < a) {
			System.out.println("���� �ܾ��� �����մϴ�.");
		}
		else {
		System.out.println("=======================");
		System.out.println("");
		
		System.out.println("����1");
		System.out.println("���¹�ȣ : " + t1.accountNumber);
		System.out.println("������ : " + t1.owner);
		System.out.println(t1.toString());
		
		System.out.println("");
		
		System.out.println("����2");
		System.out.println("���¹�ȣ : " + t2.accountNumber);
		System.out.println("������ : " + t2.owner);
		System.out.println(t2.toString());
		}
	}
}
