package H0925;
import java.util.Scanner;
public class H02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year, month=0, date;  //�Է¹��� ������
 		int cweek, week;          //���ϰ��
 		int ynum=0, mnum=0, mdate = 0;  // �ϼ��� ������ ������
		Scanner input = new Scanner(System.in);
		
		System.out.print("�⵵�� �Է��Ͻÿ� :");
		year = input.nextInt();
		
		System.out.print("���� �Է��Ͻÿ� :");
		month = input.nextInt();
		
		System.out.print("���� �Է��Ͻÿ� :");
		date = input.nextInt();
		
		
		for(int i = 1900 ; i<year ; i++) {
			
		if((i%4==0 && i%100 !=0) || i%400==0)        // �⵵���̸� �ϼ��� ��ȯ
			ynum += 366;
		else 
			ynum += 365;
		}
		
		for(int j = 1 ; j < month ; j++) {           // �޼� ���̸� �ϼ��� ��ȯ
			if (j == 1 || j==3 || j==5 || j==7 || j==8 || j==10 || j==12 )
				mnum += 31;
			else if (j == 2) {
				if((year%4==0 && year%100 !=0) || year%400==0) {
					mnum += 29;}
				else {
					mnum += 28;
				}	
			}
			else 
				mnum +=30;
				
		}
		cweek = ynum + mnum + date;             // �⵵���̸� �ϼ��� �ٲ۰� + �޼� ���̸� �ϼ��� �ٲ۰� + �Է¹��� ���� = �� ���� ��¥
		week = cweek % 7;
		
		if(week == 1)
			System.out.println("�Ͽ���");
		else if (week == 2)
			System.out.println("ȭ����");
		else if (week == 3)
			System.out.println("������");
		else if (week == 4)
			System.out.println("�����");
		else if (week == 5)
			System.out.println("�ݿ���");
		else if (week == 6)
			System.out.println("�����");
	}

}
