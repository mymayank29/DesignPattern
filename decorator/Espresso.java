package decorator;

public class Espresso extends Coffee {
	
	Espresso() {
		
	}
	public String getDesc(){
		return super.getDesc() + " Espresso";
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 1;
	}

}
