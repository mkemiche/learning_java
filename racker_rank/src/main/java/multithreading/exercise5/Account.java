package multithreading.exercise5;

/**
 * @author mkemiche
 * @created 19/04/2021
 */
public class Account {

    private int withdrawal;

    public Account(){
        withdrawal = 50;
    }

    public Account(int w){
        this.withdrawal = w;
    }

    public synchronized int getWithdrawal() {
        return withdrawal;
    }

    public void amountWithdrawn(int amount){
        this.withdrawal -= amount;
    }


}
