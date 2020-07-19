package decorator.addons;

import decorator.Coffee;
import decorator.CoffeeAddOnDecorator;

public class Caramel extends CoffeeAddOnDecorator{
	Coffee component;
	Caramel(Coffee component) {
		this.component = component;
	}
	
	public String getDesc(){
		return component.getDesc() + " : Caramel";
	}
	
	@Override
	public int cost() {
		return 3+component.cost();
	}

}
