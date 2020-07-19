package observer;

public class TestingObservable {

	public static void main(String[] args) {
		WeatherStation<Integer> ws = new WeatherStation<>();
		AAplStock<Double> as = new AAplStock<>();
		PhoneDisplay pd = new PhoneDisplay();
		LaptopDisplay ld = new LaptopDisplay();
		IPadDisplay id = new IPadDisplay();
		
		pd.subscribe(ws);
		ld.subscribe(ws);
		id.subscribe(ws);
		
		pd.subscribe(as);
		
		
		ws.setTemp(23);
		as.setPrice(11.11);
		ws.setTemp(7);
		ws.remove(ld);
		ws.setTemp(56);
		as.setPrice(44.99);
	}

}
