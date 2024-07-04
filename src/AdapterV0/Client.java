package AdapterV0;

public class Client {
    public static void main(String[] args) {
        PhonePe p = new PhonePe();
        p.doFastTagRecharge(10);
        p.availLoan();
    }
}
