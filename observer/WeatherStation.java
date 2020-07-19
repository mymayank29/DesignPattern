package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation<T> implements IObservable<T> {
	List<IObserver> observers;
	T temp;
	
	WeatherStation() {
		observers = new ArrayList<>();
	}
	@Override
	public void add(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void remove(IObserver observer) {
		observers.remove(observer);

	}
	
	@Override
	public void notifyObservers() {
		for(IObserver observer : observers){
			observer.update(this);
		}
	}
	
	public T getState(){
		return this.temp;
	}
	
	public void setTemp(T temp){
		this.temp = temp;
		this.notifyObservers();
	}

}
