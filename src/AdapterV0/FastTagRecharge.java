package AdapterV0;

public class FastTagRecharge {
    boolean recharge(int amt , YesBankAPI yesBankAPI){
        if(yesBankAPI.getBalance() > amt){
            System.out.println("Fast tag is recharged");
            return true;
        }
        return false;
    }
}
