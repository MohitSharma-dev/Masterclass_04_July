package AdapterV1;

public class BankAPIFactory {
    public static BankAPI getBankAPIByName(String bankName) {
        BankAPI bankAPI = null;
        if(bankName.equals("Yes Bank")){
            bankAPI = new YesBankAPIAdapter();
        } else if (bankName.equals("ICICI")){
            bankAPI = new ICICIBankAdapter();
        }
        return bankAPI;
    }
}

// factory method
// abstract method