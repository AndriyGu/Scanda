package by.gsu.epamlab.ClasessTasks.Task1;

/**
 * Created by AdanaC on 01.03.2017.
 */
public class BusinessTrip {
    public final static int RATE = 25000;
    private String account = "Anton Shumsky";
    private int transport = 50000;
    private int days = 5;
    private int totalPrice;

    public static int getRATE() {
        return RATE;
    }



    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }



    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }


    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getTotalPrice(){
        return totalPrice=RATE*days+transport;
    }



    public BusinessTrip(){
        this.account=null;
        this.transport=0;
        this.days=0;
        this.totalPrice=0;

    };
    public BusinessTrip(String account, int transport, int days){
        this.account=account;
        this.transport=transport;
        this.days=days;
        this.totalPrice=RATE*days+transport;

    };

    public void show(){

        System.out.println("account "+getAccount()+";");
        System.out.println("transport "+getTransport()+";");
        System.out.println("days "+getDays()+";");
        System.out.println("total "+getTotalPrice()+";");
    }

    public String toString(){
        String lineString =this.account+";"+this.transport+";"+this.days+";"+this.totalPrice;
        return lineString;
    }

}
