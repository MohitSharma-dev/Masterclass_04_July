package AdapterV0;

public class PhonePeLoan {
    boolean checkEligibility(YesBankAPI yesBankAPI){
        if(yesBankAPI.getBalance() > 100){
            return true;
        }
        return false;
    }
}
