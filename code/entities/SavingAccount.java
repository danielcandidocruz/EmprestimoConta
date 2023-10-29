package code.entities;

import code.entities.Account;

public class SavingAccount extends Account {
    
    private Double interestRate;

    public SavingAccount() {
        super();
    }

    public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public Double setInterestRate(Double InterestRate) {
        this.interestRate = InterestRate;
    }
    public void updateBalance() {
        balance += balance + interestRate;
    }

}
