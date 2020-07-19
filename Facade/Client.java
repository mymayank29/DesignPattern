package Facade;

public class Client {

	public static void main(String[] args) throws Exception {
		ATMMachine atmMachine = new ATMMachine(123456,567);
		atmMachine.withdrawAmount(500);
		atmMachine.withdrawAmount(500);
		atmMachine.depositAmount(1000);
		System.out.println("your net balance: " + atmMachine.getBalance());
	}
}
