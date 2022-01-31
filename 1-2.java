package H0921;
import java.util.Scanner;
public class H02 {
	public static void main(String args[]) {
		
		int year;                                        // 년도를 입력 받을 변수 생성
		Scanner input = new Scanner(System.in);
		System.out.print("년도를 입력하시오 :");               // 년도를 입력받음
		year = input.nextInt();
		if((year%4==0 && year%100 !=0) || year%400==0)   // (4의배수 and 100의 배수가 아니다) or 400의 배수 는 윤년
			System.out.print(year + "년은 윤년입니다.");
		else 
			System.out.print(year + "년은 윤년이 아닙니다.");
	}
}
