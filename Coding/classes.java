public class classes {
    public static void main(String[] args) {
        Bank b=new Bank();
        System.out.println("Status"+b.getstatus());
        b.openBank();
        System.out.println("Status"+b.getstatus());
        System.out.println("There are"+b.getNumofCustomer());
        b.arrive();
        b.arrive();
        System.out.println("Now"+b.getNumofCustomer());
        b.depart();
        System.out.println("There are"+b.getNumofCustomer());
    }
}
class Bank{
    int num_of_customers=0;
    String status="Closed";
    public void arrive(){
        num_of_customers++;
    }
    public void depart(){
        num_of_customers--;
    }
    public void openbank(){
        status="Open";
    }
    public void closeBank()[
        status="Closed";
    ]
    public void getstatus(){
        return status;
    }
    public int getnumofcustomers(){
        return num_of_customers();
    }
}
