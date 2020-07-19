package decorator;

public class Mocha extends Coffee{
	
	
	public Mocha(){}
	public String getDesc(){
		return super.getDesc() + " Mocha";
	}
	@Override
	public int cost() {
		return 2;
	}

}
