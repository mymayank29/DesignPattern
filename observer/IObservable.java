package observer;

public interface IObservable<T> {
	void add(IObserver observer);
	void remove(IObserver observer);
	void notifyObservers();
	T getState();
}
