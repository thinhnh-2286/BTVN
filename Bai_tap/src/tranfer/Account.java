package tranfer;

public class Account {
	protected String id;
	protected String name;
	protected int balance = 0;

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void credit(int amount) {
		if (amount < 0) {
			System.out.println("So tien nhap vao phai lon hon 0");
			return;
		}
		balance = balance + amount;

	}

	public void debit(int amount) {
		if (amount < 0) {
			System.out.println("So tien nhap vao phai lon hon 0");
		}
		if (amount > balance) {
			System.out.println("So du tai khoan khong du");
		}
		balance = balance - amount;
	}
	public void tranferTo(Account accountFrom, Account accountTo, int amount) {
		accountFrom.debit(amount);
		accountTo.credit(amount);
	}
	
	public void displayMoney_before(){
		System.out.println("So du tai khoan cua " +name+ " truoc khi chuyen là: " + balance);
	}
	public void displayMoney_after(){
		System.out.println("So du tai khoan cua " +name+ " sau khi chuyen là: " + balance);
	}
}


