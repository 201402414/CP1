package H1207;

public class Spider extends Animal{
	
	public Spider () {
		super(8);
	}
	public void eat() {
		System.out.println("거미는 거미줄에 걸린 곤추을 먹습니다.");
	}
	public void walk() {
		System.out.println("이 동물은 "+this.leg+"개의 다리로 걷습니다.");
	}
}
