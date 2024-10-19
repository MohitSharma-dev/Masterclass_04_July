package AdapterV0;

public class PhonePe {
    YesBankAPI yesBankAPI;
    PhonePeLoan phonePeLoan;

    public YesBankAPI getYesBankAPI() {
        return yesBankAPI;
    }

    public void setYesBankAPI(YesBankAPI yesBankAPI) {
        this.yesBankAPI = yesBankAPI;
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
