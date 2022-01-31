package H1019;
import java.util.Scanner;
public class H02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		String s;
		Scanner input = new Scanner(System.in);
		System.out.print("¹®ÀÚ¸¦ ÀÔ·ÂÇÏ½Ã¿À :");
		s = input.nextLine();
		for(int i = 0 ; i < s.length(); i++) {
		a = s.charAt(i);
		if(a<91) {
			a = a + 32;
		}
		else if (a>97) {
			a = a - 32;
		}
		System.out.printf("%c",a);
		}
		
	}

}
//
