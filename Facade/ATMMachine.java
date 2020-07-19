package Facade;

public class ATMMachine {
	int accountNo;
	int securityCode;
	WelcomeBank welcomeBank;
	TransactionAmount transactionAmount;
	TestingAccountAndSecurityCode testingAccAndSecCode;
	ATMMachine(int acc, int secCode){
		this.accountNo = acc;
		this.securityCode = secCode;
		this.welcomeBank = new WelcomeBank();
		this.testingAccAndSecCode = new TestingAccountAndSecurityCode();
		this.transactionAmount = new TransactionAmount();
	}
	public boolean testAccAndSecCode(){
		return this.testingAccAndSecCode.testAccountNoAndSecCode(accountNo, securityCode);
	}
	public void getWelcomeMessage() {
		this.welcomeBank.showWelcomeMessage();
	}
	public void withdrawAmount(double amount) throws Exception{
		if(testAccAndSecCode()) {
			getWelcomeMessage();
			this.transactionAmount.withDraw(amount);
			System.out.println("withdraw successfully ** your net balance is :" + this.getBalance() + " **");
		}
		else {
			System.out.println("Sorry account no and code are wrong");
		}
	}
	public void depositAmount(int amount) throws Exception{
		if(testAccAndSecCode()) {
			getWelcomeMessage();
			this.transactionAmount.depositAmount(amount);
			System.out.println("deposited successfully ** your net balance is :" + this.getBalance() + " **");
		}
		else {
			System.out.println("Sorry account no and code are wrong");
		}
	}
	public double getBalance() {
		if(testAccAndSecCode()) {
			return this.transactionAmount.getBalance();
		}
		return -1.0;
	}
	
}
