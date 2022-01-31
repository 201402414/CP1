package H1031;
import java.util.Scanner;
public class H01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int min, max;
		
		int[] a = new int[10];
		for ( int i = 0 ; i < 10 ; i++ ) 
		a [i] = (int)(Math.random()*100);	
	
		
		min = a[0];
		max = a[0];
		
		for( int j = 1 ; j < 10 ; j ++ ) 
			if (a[j] > max) 
				max = a[j];
			
		for ( int k = 1 ; k < 10 ; k ++) 
			if (min > a[k])
				min = a[k];
		
		System.out.println("10개의 수 중 가장 큰 숫자 : " + max);
		System.out.println("10개의 수 중 가장 작은 숫자 : " + min);
	}

}
