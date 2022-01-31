package H1112;

class BankAccount {
	String accountNumber; //°èÁÂ¹øÈ£
	String owner; // ¿¹±ÝÁÖ
	int balance; // ÀÜ¾×Ç¥½Ã
	
	public BankAccount() {
		accountNumber = "";
		owner = "";
		balance = 0;
	}
	
	void deposit (int amount) {
		balance = balance + amount;
	}
	void withdraw(int amount) {
		balance = balance - amount;
	}
	public String toString() {
		return "ÀÜ¾× : "+balance;
	}
	public void sendAccount(int amount, BankAccount otherAccount) {
		otherAccount.balance += amount;
		balance = balance - amount;
	}
}



