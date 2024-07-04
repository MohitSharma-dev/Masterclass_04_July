package AdapterV1;

public class ICICIBankAdapter implements BankAPI{
    ICICIBankAPI icicibankAPI = new ICICIBankAPI();
    @Override
    public int checkBalance() {
        return icicibankAPI.balanceCheck();
    }

    @Override
    public void transfer() {
        icicibankAPI.moneyTransfer(100);
    }
}
