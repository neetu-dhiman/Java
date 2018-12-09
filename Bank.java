
import java.util.*;
/*
	* Singleton Pattern
*/
class Bank {
	private static Bank instance;
	private Map <String, BankAccount> bankAccounts;
	private Bank() {
		bankAccounts = new HashMap<String, BankAccount>();
		bankAccounts.put("123456", new BankAccount("123456"));
	}
	public static synchronized  Bank getInstance() {
		if(instance == null) {
			instance = new Bank();
		}
		return instance;
	}
	
	public BankAccount getAccount(String accountNumber) {
        return bankAccounts.get(accountNumber);
    }
}