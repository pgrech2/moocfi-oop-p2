public class Account {
    private String accountID;
    private int balanceAsCents;

    public Account (String accountID){
        this.accountID = accountID;
        this.balanceAsCents = 0;
    }

    public void deposit (int sum){
        this.balanceAsCents += sum;
    }

    public int getBalance () {
        return this.balanceAsCents;
    }
}
