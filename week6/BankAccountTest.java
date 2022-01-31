package H1112;
import java.util.Scanner;
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		
		BankAccount t1 = new BankAccount();
		BankAccount t2 = new BankAccount();
		System.out.println("계좌1 정보 입력");
		System.out.print("계좌 번호 :");
		t1.accountNumber = input.nextLine();
		System.out.print("예금주 :");
		t1.owner = input.nextLine();
		System.out.print("초기 잔액 : ");
		t1.balance = input.nextInt();
		
		System.out.println("");
		
		System.out.println("계좌2 정보 입력");
		System.out.print("계좌 번호 :");
		t2.accountNumber = input.nextLine();
		t2.accountNumber = input.nextLine();
		System.out.print("예금주 :");
		t2.owner = input.nextLine();
		System.out.print("초기 잔액 : ");
		t2.balance = input.nextInt();
		
		System.out.println("");
		
		System.out.print("계좌1에서 계좌2로 송금할 금액 : ");
		a = input.nextInt();
		t1.sendAccount(a, t2);
		
		if(t1.balance+1 < a) {
			System.out.println("계좌 잔액이 부족합니다.");
		}
		else {
		System.out.println("=======================");
		System.out.println("");
		
		System.out.println("계좌1");
		System.out.println("계좌번호 : " + t1.accountNumber);
		System.out.println("예금주 : " + t1.owner);
		System.out.println(t1.toString());
		
		System.out.println("");
		
		System.out.println("계좌2");
		System.out.println("계좌번호 : " + t2.accountNumber);
		System.out.println("예금주 : " + t2.owner);
		System.out.println(t2.toString());
		}
	}
}
