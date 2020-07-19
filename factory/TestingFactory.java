package factory;

public class TestingFactory {

	public static void main(String[] arrgs) {
		
		Factory f = new FactoryImplementation();
		Product p = f.getProduct(19);
		System.out.println(p.myToy());
	}
}

