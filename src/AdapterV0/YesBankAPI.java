package AdapterV0;

public class YesBankAPI {
    public int getBalance(){
        return 100;
    }

    public void moneyTransfer(double amount){
        System.out.println("Money is transferred using Yes bank");
    }
}
