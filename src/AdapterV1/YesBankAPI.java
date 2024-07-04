package AdapterV1;

public class YesBankAPI {
    public int getBalance(){
        System.out.println("Balance is checked using YesBank");
        return 100;
    }

    public void moneyTransfer(double amount){
        System.out.println("Money is transferred using Yes bank");
    }
}
