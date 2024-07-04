package AdapterV1;

public class PhonePe {
    BankAPI bankAPI;
    PhonePeLoan phonePeLoan;
    FastTagRecharge fastTagRecharge;
    PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
        phonePeLoan = new PhonePeLoan();
        fastTagRecharge = new FastTagRecharge();
    }

    boolean availLoan(){
         if (phonePeLoan.checkEligibility(bankAPI)){
             System.out.println("Loan is allocated");
             return true;
         }
         return false;
    }

    boolean doFastTagRecharge(int amt){
       return fastTagRecharge.recharge(amt , bankAPI);
    }
}
