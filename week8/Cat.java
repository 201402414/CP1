package H1207;

public class Cat extends Animal implements Pet{
	private String name;
	
	public Cat(String name) {
		super(4);
		this.name = name;
	}
	public Cat() {
		super(4);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void play() {
		System.out.println("고양이가 공을 가지고 놉니다.");
	}
	public void eat() {
		System.out.println("고양이가 생선을 잘 먹습니다.");
	}
	public void walk() {
		System.out.println("이동물은 "+this.leg + "개의 다리로 걷습니다.");
	}
}