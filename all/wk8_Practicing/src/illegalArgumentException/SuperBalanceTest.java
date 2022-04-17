package illegalArgumentException;

public class SuperBalanceTest {

	public static void main(String[] args) {
		SuperBalance account1 = new SuperBalance("Martin Blue","12345678",100.0);
		SuperBalance account2 = new SuperBalance("Alex Red","12345678",1000.0);
		
		try {
			account1.pay(account2, 1000);
		}
		catch(IllegalArgumentException e) {
			System.out.printf("%nException while pay money : %s%n",e.getMessage());
		}
		System.out.print(account1);
		System.out.print(account2);
		System.out.println(SuperBalance.getBalance_account_number());
	}

}
