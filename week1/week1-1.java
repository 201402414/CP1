package H0921;
import java.util.Scanner;                             // 스케너를 쓰기위해 import 한다.
public class H01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sec,sec1;      // 변수 입력
		int min;
		int hour;
		
		Scanner input = new Scanner(System.in);  // 스케너 클레스 사용
		System.out.print("변환할 초 입력 :");
		sec = input.nextInt();
		min = sec/60%60;      // sec/60 을하면 분이 나온다. 만약 60을 초과할 경우 시간으로 넘어가기 때문에  나머지만 구해도 된다.
		hour = sec/3600;      // sec/3600 을 하면 시간이 나온다.
		sec1 = sec%60;        // sec를 60 으로 나눈 나머지가 초가 된다.
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.\n",sec,hour,min,sec1);  
		System.out.println(sec+"초는 "+hour+"시간 "+min+"분 "+sec1+"초 입니다.");
	}

}
