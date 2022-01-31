package H1207;

public abstract class Animal {
	protected int leg;
	
	public Animal(int leg) {
		this.leg = leg;
	}
	public abstract void eat();
	public abstract void walk();
	
}
