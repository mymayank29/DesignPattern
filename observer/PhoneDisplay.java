package observer;

import java.util.ArrayList;
import java.util.List;

public class PhoneDisplay implements IObserver {
	
	List<IObservable> stations;
	int temp;
	PhoneDisplay(){
		stations = new ArrayList<>();
	}
	
	public void subscribe(IObservable currentStation){
		this.stations.add(currentStation);
		currentStation.add(this);
	}
	@Override
	public void update(IObservable currentStation){
		System.out.println("phone display got " + currentStation.getState());
	}
}
