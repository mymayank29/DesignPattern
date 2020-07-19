package observer;

import java.util.ArrayList;
import java.util.List;

public class AAplStock<T> implements IObservable<T> {
	List<IObserver> observers;
	T stockPrice;
	
	AAplStock() {
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
		return this.stockPrice;
	}
	
	public void setPrice(T price){
		this.stockPrice = price;
		this.notifyObservers();
	}
}
