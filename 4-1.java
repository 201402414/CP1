package H1019;
import java.util.Scanner;
public class H01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		int count=0, counta =0;
		String s;
		System.out.print("문자를 입력하시오. :");
		s = input.nextLine();
		for(int i = 0; i < s.length(); i++) {
		a = (int)s.charAt(i);
		if (a<=123&&a>=97) {
			if(a==97||a==105||a==101||a==111||a==117) {
				counta++;
			}
			else {
				count++;
			}
		}
		else if (a<=90&&a>=65) {
			if(a==65||a==73||a==69||a==79||a==85) {
				counta++;
			}
			else {
				count++;
			}
		}
		}
		System.out.println("자음의 개수 :" + count);
		System.out.println("모음의 개수 :" + counta);
	}

}
