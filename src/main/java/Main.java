public class Main {
    public static void main(String args[]){
        IObserver cus1= new Customer("Saurabh");
        IObserver cus2= new Customer("Rohit");
        IObserver supp1=new Suppliers("Supp1");
        IObservable iphone=new Iphone();
        iphone.addObserver(cus1);
        iphone.addObserver(cus2);
        iphone.addObserver(supp1);
        iphone.addFreshStock(20);
        iphone.notifyAllObservers();
    }
}
