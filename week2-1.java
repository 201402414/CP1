package H0925;
import java.util.Scanner;
public class H01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stage=0, cc=0, uc = 0;      
		String user;
		Scanner input = new Scanner(System.in);
				
		while(stage < 7) {
					
		System.out.print("가위, 바위, 보 중에 고르시오: ");
		user = input.nextLine();
		int random = (int)(Math.random()*9)+1;
		switch (random) {
		case 1: case 4: case 7:        //가위
			if(user.equals("바위")) {
				System.out.print("이겼다!  ");
				stage += 1;
				uc += 1;}
			else if (user.equals("가위")) 
				System.out.print("비겼다!  ");
			else {
				System.out.print("졌다!  ");
				stage += 1;
				cc += 1;}
			System.out.printf("stage %d > user : %d vs computer %d승",stage,uc,cc);
			System.out.println("");
			break;
		case 2: case 5: case 8:         // 바위
			if(user.equals("바위")) 
				System.out.print("비겼다!  ");
				
			else if (user.equals("가위")) {
				System.out.print("졌다!  ");
				stage += 1;
				cc += 1;}
			else {
				System.out.print("이겼다!  ");
				stage += 1;
				uc += 1;}
			System.out.printf("stage %d > user : %d vs computer %d승",stage,uc,cc);
			System.out.println("");
		break;
		case 3: case 6: case 9:         //보
			if(user.equals("바위")) {
				System.out.print("졌다!  ");
				stage += 1;
				cc += 1;}
			else if (user.equals("가위")) {
				System.out.print("이겼다!  ");
				stage += 1;
				uc += 1;}
			else
				System.out.print("비겼다!  ");
			System.out.printf("stage %d > user : %d vs computer %d승",stage,uc,cc);
			System.out.println("");
		break;		
		
		default:
		break;	}
		}
		if (uc > cc)
			System.out.println("승자는 : user");
		else if (cc > uc)
			System.out.println("승자는 : computer");
		else
			System.out.println("오류");
		}
}
