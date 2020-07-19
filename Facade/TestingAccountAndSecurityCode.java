package Facade;

public class TestingAccountAndSecurityCode {
	private int accountNo;
	private int securityCode;
	public TestingAccountAndSecurityCode() {
		this.accountNo = 123456;
		this.securityCode = 567;
	}
	public boolean testAccountNoAndSecCode(int acc, int secCode){
		if(acc == this.accountNo && secCode == this.securityCode) {
			return true;
		}
		return false;
	}
	
}
