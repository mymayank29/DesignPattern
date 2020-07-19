package Facade;

public class TransactionAmount {
	double initialAmount = 1000;

	public TransactionAmount() {
		
	}

	public double getBalance() {
		return initialAmount;
	}

	public boolean checkIfWithdrawPossible(double amount) {
		if(amount <= initialAmount) {
			return true;
		}
		return false;
	}
	public void withDraw(double amount) throws Exception {
		if(this.checkIfWithdrawPossible(amount)) {
			initialAmount -= amount;
		}
		else {
			throw new Exception("Not enough balance");
		}
	}
	public void depositAmount(double amount) throws Exception {
		initialAmount += amount;
	}
	
}
