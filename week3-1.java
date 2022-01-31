package H0928;

public class H01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1, temp;
		
			System.out.print(a+ " "+ b+" ");
		for (int i = 1; i <= 8; i++) {
			temp = a + b;
			a = b;
			b = temp;
			
			System.out.print(temp + " ");
		}
	}

}
