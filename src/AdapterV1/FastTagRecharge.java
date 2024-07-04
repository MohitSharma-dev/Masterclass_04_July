package AdapterV1;

public class FastTagRecharge {
    boolean recharge(int amt , BankAPI bankAPI){
        if(bankAPI.checkBalance() > amt){
            System.out.println("Fast tag is recharged");
            return true;
        }
        return false;
    }
}
