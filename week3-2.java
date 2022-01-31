package H0928;
import java.util.Scanner;
public class H02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String a;
		System.out.println("문자를 입력하세요 :");
		a = input.nextLine();
		
	
		switch(a) {
		
		case "a": case "i": case "e": case "o": case "u":
		case "A": case "I": case "E": case "O": case "U":
		System.out.println("모음입니다.");
		break;
		
		case "b": case "B": case "c": case "C": case "d": case "D":
		case "f": case "F": case "g": case "G": case "h": case "H":
		case "j": case "J": case "k": case "K": case "l": case "L":
		case "m": case "M": case "n": case "N": case "p": case "P":
		case "q": case "Q": case "r": case "R": case "s": case "S":
		case "t": case "T": case "v": case "V": case "w": case "W":
		case "x": case "X":	case "y": case "Y": case "z": case "Z":		
		System.out.println("자음입니다.");
		break;
		
		default:
		System.out.println("잘못 입력");
		}
		
		
	}	
}

