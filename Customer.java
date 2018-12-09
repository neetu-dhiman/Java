class Customer implements Runnable{
	public void run() {
        Bank bank = Bank.getInstance();
		System.out.println("Bank instance " + bank.hashCode());
        BankAccount account = bank.getAccount("123456");
		synchronized(account) {
			System.out.println(account + " , " + account.hashCode());
			account.deposit(100);
			account.withdraw(200);
		}
    }
}