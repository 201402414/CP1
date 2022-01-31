package H1127;

import java.util.Scanner;

public class Person {
	String name;
	String adress;
	String tell;
	
	public Person () {
	}
	
	public String getName() {
		return name;
	}
	void setName(String n) {
		this.name =n;
	}
	public String getAdress() {
		return adress;
	}
	void setAdress(String a) {
		this.adress = a;
	}
	public String GetTell() {
		return tell;
	}
	void setTell(String t) {
		this.tell = t;
	}
}

class Customer extends Person {
	String code;
	String mile;
	
	public Customer() {
	}
	public String getcode() {
		return code;
	}
	void setcode(String t2) {
		code = t2;
	}
	public String getMile() {
		return mile;
	}
	void setMile(String m) {
		mile = m;
	}
	
}
