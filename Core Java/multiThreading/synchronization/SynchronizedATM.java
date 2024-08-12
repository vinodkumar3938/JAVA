package multiThreading.synchronization;

class ATM{
	
	void checkBalance(String name){
		System.out.println(name + "is checking Balance");
	}
	
	void withdraw(String name, int amount) {
		System.out.println(name + " is withdrawing " + amount);
	}
	
}

class Customer{
	
	ATM atm;
	String name;
	int amount;
	
	Customer(ATM atm){
		this.atm = atm;
	}
	
	void useATM() {
		atm.checkBalance(name);
		atm.withdraw(name, amount);
	}
	
}
public class SynchronizedATM {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Customer c1 = new Customer(atm);
		atm.checkBalance("Vinod");
		atm.withdraw("Vinod",30000);
		c1.useATM();
	}
}
