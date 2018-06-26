import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Account> accounts;

    private double money;

    public Person (String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public int totalMoney() {
        int total = 0;
        for (Account a : this.accounts) {
            total += a.getBalance();
        }
        return total;
    }

    public boolean enoughMoneyForSingleTicket() {
        if (this.money >= HslPrices.SINGLETICKET_ADULT) {
            return true;
        }
        return false;
    }

}
