package AdapterV1;

public class ICICIBankAPI {
    int balanceCheck(){
        System.out.println("Balance is checked using ICICI");
        return 100;
    }

    void moneyTransfer(double amount){
        System.out.println("Money is transferred using ICICI");
    }

}
