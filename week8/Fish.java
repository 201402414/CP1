package H1207;

public class Fish extends Animal implements Pet{
	private String name;

	public Fish() {
		super(0);
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("물고기는 먹이를 먹습니다.");
	}
	public void walk() {
		System.out.println("이 동물은 헤엄칩니다.");
	}
	public void play() {
		System.out.println("물고기가 헤엄치며 놉니다.");
	}
	
	
}
