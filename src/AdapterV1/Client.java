package AdapterV1;

import java.util.Scanner;

public class Client {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String bankName = sc.nextLine();
        BankAPI bankAPI = BankAPIFactory.getBankAPIByName(bankName);
        PhonePe p = new PhonePe(bankAPI);
        p.doFastTagRecharge(10);
        p.availLoan();
    }
}
