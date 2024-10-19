package AdapterV1;

public class PhonePe {
    BankAPI bankAPI;

    public BankAPI getBankAPI() {
        return bankAPI;
    }

    public void setBankAPI(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    public PhonePeLoan getPhonePeLoan() {
        return phonePeLoan;
    }

    public void setPhonePeLoan(PhonePeLoan phonePeLoan) {
        this.phonePeLoan = phonePeLoan;
    }

    public FastTagRecharge getFastTagRecharge() {
        return fastTagRecharge;
    }

    public void setFastTagRecharge(FastTagRecharge fastTagRecharge) {
        this.fastTagRecharge = fastTagRecharge;
    }

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
