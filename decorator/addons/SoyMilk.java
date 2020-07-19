package decorator.addons;

import decorator.Coffee;
import decorator.CoffeeAddOnDecorator;

public class SoyMilk extends CoffeeAddOnDecorator{
	Coffee component;
	SoyMilk(Coffee component) {
		this.component = component;
	}
	public String getDesc(){
		return component.getDesc() + " : SoyMilk";
	}
	@Override
	public int cost() {
		return 6+component.cost();
	}

}
