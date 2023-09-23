public class Suppliers implements IObserver{
    String id;
    Suppliers(String id){
        this.id=id;
    }
    @Override
    public void sendNotification() {
        System.out.println(this.id+" has bee notified stocks given by them has been added");
    }
}
