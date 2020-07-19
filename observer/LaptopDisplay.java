package observer;

import java.util.ArrayList;
import java.util.List;

public class LaptopDisplay implements IObserver {
	List<IObservable> stations;
	int temp;
	LaptopDisplay(){
		stations = new ArrayList<>();
	}
	
	public void subscribe(IObservable currentStation){
		this.stations.add(currentStation);
		currentStation.add(this);
	}
	@Override
	public void update( IObservable currentStation){
		System.out.println("laptop display got " + currentStation.getState());
	}
}
