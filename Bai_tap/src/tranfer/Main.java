package tranfer;

public class Main {

	public static void main(String[] args) {
		Account a1 = new Account("1", "Thinh", 20);
		Account a2 = new Account("1", "ThinhNH", 50);
		a1.displayMoney_before();
		a2.displayMoney_before();
		a2.tranferTo(a2,a1, 5);
		a1.displayMoney_after();
		a2.displayMoney_after();
	}

}
