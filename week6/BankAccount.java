package H1112;

class BankAccount {
	String accountNumber; //���¹�ȣ
	String owner; // ������
	int balance; // �ܾ�ǥ��
	
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
		return "�ܾ� : "+balance;
	}
	public void sendAccount(int amount, BankAccount otherAccount) {
		otherAccount.balance += amount;
		balance = balance - amount;
	}
}



