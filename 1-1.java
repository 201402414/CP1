package H0921;
import java.util.Scanner;                             // ���ɳʸ� �������� import �Ѵ�.
public class H01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sec,sec1;      // ���� �Է�
		int min;
		int hour;
		
		Scanner input = new Scanner(System.in);  // ���ɳ� Ŭ���� ���
		System.out.print("��ȯ�� �� �Է� :");
		sec = input.nextInt();
		min = sec/60%60;      // sec/60 ���ϸ� ���� ���´�. ���� 60�� �ʰ��� ��� �ð����� �Ѿ�� ������  �������� ���ص� �ȴ�.
		hour = sec/3600;      // sec/3600 �� �ϸ� �ð��� ���´�.
		sec1 = sec%60;        // sec�� 60 ���� ���� �������� �ʰ� �ȴ�.
		System.out.printf("%d�ʴ� %d�ð� %d�� %d�� �Դϴ�.\n",sec,hour,min,sec1);  
		System.out.println(sec+"�ʴ� "+hour+"�ð� "+min+"�� "+sec1+"�� �Դϴ�.");
	}

}
