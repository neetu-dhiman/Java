class BankAccount {
	private double balance;
	private String accountNumber;
	
	public BankAccount( String acNo) {
		this.balance = 0;
		this.accountNumber = acNo;
	}
	public BankAccount( String acNo, double initialBalance) {
		this.balance = initialBalance;
		this.accountNumber = acNo;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance(){
		return balance;
	}
	
	public void deposit(double amount){
		balance +=amount;
		System.out.println(Thread.currentThread().getName() + " depositing the amount "+amount+" updated balance =  " + balance);
	}
	
	public double withdraw(double amount) {
		System.out.println(Thread.currentThread().getName() + " trying to withdraw " + amount + " from the account " + accountNumber + "and the balance is " + balance);
		if((balance-amount) < (double)0 ) {
			System.out.println("Insufficient Amount");
			return 0;
		}
		
		balance = balance-amount;
		System.out.println(Thread.currentThread().getName() + " successfully withdrow the amount. balance left =  " + balance);
		return balance;	
	}
	public String toString() {
		return "accout  number" + this.accountNumber + " balance " + this.balance;
	}
}