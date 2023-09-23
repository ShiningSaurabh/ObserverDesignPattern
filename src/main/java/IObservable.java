public interface IObservable {
    void addObserver(IObserver obj);
    void removeObserver(IObserver obj);
    void notifyAllObservers();
    void addFreshStock(int freshStock);
}
