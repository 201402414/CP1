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
		System.out.println("������ ���̸� �Խ��ϴ�.");
	}
	public void walk() {
		System.out.println("�� ������ ���Ĩ�ϴ�.");
	}
	public void play() {
		System.out.println("����Ⱑ ���ġ�� ��ϴ�.");
	}
	
	
}
