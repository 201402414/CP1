package H1019;
import java.util.Scanner;

class Date {
	int year, month=0, date;
	String month1;
	void printEastern() {
		System.out.printf("����� ���� ǥ�� : %d.%d.%d\n",year,month,date);
	}
	
	void printWestern() {
		switch(month){
		case 1: 
		month1 = "January";
		case 2:
		month1 = "February";
		case 3:
		month1 = "March";
		case 4:
		month1 = "April";
		case 5:
		month1 = "May";
		case 6:
		month1 = "June";
		case 7:
		month1 = "July";
		case 8:
		month1 = "August";
		case 9:
		month1 = "September";
		case 10:
		month1 = "October";
		case 11:
		month1 = "Novemberr";
		case 12:
		month1 = "December";
		
	}
		System.out.printf("����� ���� ǥ�� : %S %d, %d",month1,date,year);
	}
	
}


public class H03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Date test = new Date();
		System.out.print("���� �Է� : ");
		test.year = input.nextInt();
		System.out.print("�� �Է�  : ");
		test.month = input.nextInt();
		System.out.print("�� �Է� : ");
		test.date = input.nextInt();
		
		
		
		test.printEastern();
		test.printWestern();
	}

}
