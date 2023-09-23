import java.util.ArrayList;

public class Iphone implements IObservable{
    int stock=0;

    ArrayList<IObserver> observers= new ArrayList<>();

    @Override
    public void addObserver(IObserver obj) {
        observers.add(obj);
    }

    @Override
    public void removeObserver(IObserver obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyAllObservers() {
        for(IObserver obs:observers)
            obs.sendNotification();
    }

    @Override
    public void addFreshStock(int freshStock) {
        this.stock+=freshStock;
    }
}
