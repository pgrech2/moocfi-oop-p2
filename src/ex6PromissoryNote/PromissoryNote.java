package ex6PromissoryNote;

import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> loans = new HashMap<>();


    public void setLoan (String toWhom, Double value){
        this.loans.put(toWhom, value);
    }

    public Double howMuchIsTheDebt (String whose) {
        Double debt = this.loans.get(whose);
        if (debt != null) {
            return debt;
        } else {
            return 0.0;
        }
    }
}
