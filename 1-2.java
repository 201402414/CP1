package H0921;
import java.util.Scanner;
public class H02 {
	public static void main(String args[]) {
		
		int year;                                        // �⵵�� �Է� ���� ���� ����
		Scanner input = new Scanner(System.in);
		System.out.print("�⵵�� �Է��Ͻÿ� :");               // �⵵�� �Է¹���
		year = input.nextInt();
		if((year%4==0 && year%100 !=0) || year%400==0)   // (4�ǹ�� and 100�� ����� �ƴϴ�) or 400�� ��� �� ����
			System.out.print(year + "���� �����Դϴ�.");
		else 
			System.out.print(year + "���� ������ �ƴմϴ�.");
	}
}
