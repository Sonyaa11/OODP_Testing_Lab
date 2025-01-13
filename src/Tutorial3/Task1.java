package Tutorial3;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj = new BankAccount("123456" , 10000.0);
		obj.deposit(1000);
		
		System.out.println("Current bank balance is " + obj.getBalance());
		obj.withdraw(500);
		System.out.println("Current bank balance after the withdraw is " + obj.getBalance());
		

	}
	
}

class BankAccount {
		private String accountNumber;
		private double balance;
		
		BankAccount(String accountNumber,double initialBankBalance){
			this.accountNumber = accountNumber;
			if (initialBankBalance >=0) {
				this.balance = initialBankBalance;
			}else {
				this.balance = 0;
			}
		}
		
		//getter for accountNumber
		public String getAccountNumber() {
			return accountNumber;
			
		}
		//setter for accountNumber
		public void setAccountNumber(String acNumber) {
			this.accountNumber = acNumber;
		}
		//getter for balance
		public double getBalance() {
			return balance;
		}
	

//setter for balance 
	public void setBalance(double amount) {
		if(amount >0) {
		this.balance = amount;
		}else {
			balance = 0;
		}
	}
	
	//method for deposit
	public void deposit(double amount) {
		if(amount >0) {
		balance += amount;
		}else {
			balance = 0;
		}
	}
	//method for withdraw
	public void withdraw(double amount) {
		if(amount >0) {
		if(balance >= amount) {	
		balance -= amount;
		}else {
			System.out.println("Insufficient Funds in bank account.");
		}
		}else {
			System.out.println("Cannot withdraw negative amount."); 
			
		}
}
}
	
