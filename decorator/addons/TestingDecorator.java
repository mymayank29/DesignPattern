package decorator.addons;

import decorator.Coffee;
import decorator.Mocha;

public class TestingDecorator {

	public static void main(String[] args) {
		Coffee cf = new Mocha();
		Caramel cr1 = new Caramel(cf);
		Caramel cr2 = new Caramel(cr1);
		SoyMilk sm = new SoyMilk(cr2);
		
		System.out.println(sm.getDesc());
		System.out.println(sm.cost());

	}

}
