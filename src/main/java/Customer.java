public class Customer implements IObserver{

    String id;
    Customer(String id){
        this.id=id;
    }
    @Override
    public void sendNotification() {
        System.out.println("notification sent to "+id);
    }
}
