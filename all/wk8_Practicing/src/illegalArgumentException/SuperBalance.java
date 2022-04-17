package illegalArgumentException;

class SuperBalance {
	
	private String account;
	private String password;
	private double account_money;
	private static int balance_account_number;
	
	public SuperBalance() {
		this("no owner","00000000",0);
	}
	
	public SuperBalance(String account) {
		this(account,"00000000",0);
	}
	
	public SuperBalance(String account, String password) {
		this(account,password,0);
	}
	
	public SuperBalance(String account, String password, double account_money) {
		if(account.length() <= 6 || account.length() >= 16) {
			throw new IllegalArgumentException("your account length is not between 6 and 16 characters");
		}
		if(password.length() != 8) {
			throw new IllegalArgumentException("your password length is not 8 characters");
		}
		if(account_money < 0.0) {
			throw new IllegalArgumentException("your account_money cannot be negetive");
		}
		
		this.account = account;
		this.password = password;
		this.account_money = account_money;
		balance_account_number += 1;
	}
	
	public void setAccount(String account) {
		if(account.length() <= 6 || account.length() >= 16) {
			throw new IllegalArgumentException("your account length is not between 6 and 16 characters");
		}
		this.account = account;
	}
	
	public void setPassword(String password) {
		if(password.length() != 8) {
			throw new IllegalArgumentException("your password length is not 8 characters");
		}
		this.password = password;
	}
	
	public void setAccount_money(double account_money) {
		if(account_money < 0.0) {
			throw new IllegalArgumentException("your account_money cannot be negetive");
		}
		this.account_money = account_money;
	}
	
	public String getAccount() {
		return account;
	}
	
	public String getPassword() {
		return password;
	}
	
	public double getAccount_money() {
		return account_money;
	}
	
	public static int getBalance_account_number() {
		return balance_account_number;
	}
	
	public String toString() {
		return String.format("Your account details:%n--------------------------------------------------%nYour Account : %s%nYour Password : %s%nYour Account_money : %f%n--------------------------------------------------%n%n",getAccount(),getPassword(),getAccount_money());
	}
	
	public void pay(SuperBalance other, double payMoney) {
		if(payMoney > getAccount_money()) {
			throw new IllegalArgumentException("your account_money is less than payMoney");
		}
		other.setAccount_money(other.getAccount_money() + payMoney);
		this.setAccount_money(this.getAccount_money() + payMoney);
	}
}
