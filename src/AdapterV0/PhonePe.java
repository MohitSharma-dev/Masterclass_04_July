package AdapterV0;

public class PhonePe {
    YesBankAPI yesBankAPI;
    PhonePeLoan phonePeLoan;
    FastTagRecharge fastTagRecharge;
    PhonePe() {
        yesBankAPI = new YesBankAPI();
        phonePeLoan = new PhonePeLoan();
        fastTagRecharge = new FastTagRecharge();
    }

    boolean availLoan(){
         if (phonePeLoan.checkEligibility(yesBankAPI)){
             System.out.println("Loan is allocated");
             return true;
         }
         return false;
    }

    boolean doFastTagRecharge(int amt){
       return fastTagRecharge.recharge(amt , yesBankAPI);
    }
}
