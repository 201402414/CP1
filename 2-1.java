package H0925;
import java.util.Scanner;
public class H01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stage=0, cc=0, uc = 0;      
		String user;
		Scanner input = new Scanner(System.in);
				
		while(stage < 7) {
					
		System.out.print("����, ����, �� �߿� ���ÿ�: ");
		user = input.nextLine();
		int random = (int)(Math.random()*9)+1;
		switch (random) {
		case 1: case 4: case 7:        //����
			if(user.equals("����")) {
				System.out.print("�̰��!  ");
				stage += 1;
				uc += 1;}
			else if (user.equals("����")) 
				System.out.print("����!  ");
			else {
				System.out.print("����!  ");
				stage += 1;
				cc += 1;}
			System.out.printf("stage %d > user : %d vs computer %d��",stage,uc,cc);
			System.out.println("");
			break;
		case 2: case 5: case 8:         // ����
			if(user.equals("����")) 
				System.out.print("����!  ");
				
			else if (user.equals("����")) {
				System.out.print("����!  ");
				stage += 1;
				cc += 1;}
			else {
				System.out.print("�̰��!  ");
				stage += 1;
				uc += 1;}
			System.out.printf("stage %d > user : %d vs computer %d��",stage,uc,cc);
			System.out.println("");
		break;
		case 3: case 6: case 9:         //��
			if(user.equals("����")) {
				System.out.print("����!  ");
				stage += 1;
				cc += 1;}
			else if (user.equals("����")) {
				System.out.print("�̰��!  ");
				stage += 1;
				uc += 1;}
			else
				System.out.print("����!  ");
			System.out.printf("stage %d > user : %d vs computer %d��",stage,uc,cc);
			System.out.println("");
		break;		
		
		default:
		break;	}
		}
		if (uc > cc)
			System.out.println("���ڴ� : user");
		else if (cc > uc)
			System.out.println("���ڴ� : computer");
		else
			System.out.println("����");
		}
}
