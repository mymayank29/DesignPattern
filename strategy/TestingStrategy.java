package strategy;

public class TestingStrategy {

	public static void main(String[] args) {
		Duck wd = new WildDuck();
		wd.quack();
		Duck cd = new CityDuck();
		cd.quack();
		Duck pd = new PetDuck();
		pd.quack();

	}

}
