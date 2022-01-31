package H0925;
import java.util.Scanner;
public class H02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year, month=0, date;  //입력받을 변수들
 		int cweek, week;          //요일계산
 		int ynum=0, mnum=0, mdate = 0;  // 일수가 누적될 변수들
		Scanner input = new Scanner(System.in);
		
		System.out.print("년도를 입력하시오 :");
		year = input.nextInt();
		
		System.out.print("달을 입력하시오 :");
		month = input.nextInt();
		
		System.out.print("일을 입력하시오 :");
		date = input.nextInt();
		
		
		for(int i = 1900 ; i<year ; i++) {
			
		if((i%4==0 && i%100 !=0) || i%400==0)        // 년도차이를 일수로 변환
			ynum += 366;
		else 
			ynum += 365;
		}
		
		for(int j = 1 ; j < month ; j++) {           // 달수 차이를 일수로 변환
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
		cweek = ynum + mnum + date;             // 년도차이를 일수로 바꾼거 + 달수 차이를 일수로 바꾼거 + 입력받은 일자 = 총 지난 날짜
		week = cweek % 7;
		
		if(week == 1)
			System.out.println("일요일");
		else if (week == 2)
			System.out.println("화요일");
		else if (week == 3)
			System.out.println("수요일");
		else if (week == 4)
			System.out.println("목요일");
		else if (week == 5)
			System.out.println("금요일");
		else if (week == 6)
			System.out.println("토요일");
	}

}
