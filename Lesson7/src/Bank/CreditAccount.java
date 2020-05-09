package Bank;

import java.math.BigDecimal;

public class CreditAccount extends Account {
    private BigDecimal creditLimit;

    public CreditAccount(BigDecimal percents, BigDecimal creditLimit) {
        super(percents);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withDraw(BigDecimal amount) { //throws Exception
        BigDecimal balanceBeforeOperation = getBalance();
        if (amount.compareTo(getBalance().add(creditLimit)) <= 0) {
            topUp(amount.negate());
            addTransactionLog(date.getTime(), "WithDraw", balanceBeforeOperation, getBalance());
            System.out.println("You have withdrawn "+amount+". The balance now is: "+getBalance());
        } //else throw new Exception("No sufficient funds in account");
    }


    @Override
    public BigDecimal applyPercentage() {
        BigDecimal balanceBeforeOperation = getBalance();
            topUp(getBalance().multiply(getPercentsAsMultiplier()));
            addTransactionLog(date.getTime(),"ApplyPercents",balanceBeforeOperation,getBalance());
        System.out.println("You have apply "+getPercents()+"% on account balance. The balance now is: "+getBalance());
        return null;
    }

    @Override
    public BigDecimal transferMoney(String bankName, int accountNumber, BigDecimal amount) throws Exception {
        //TODO:exception żeby nie było amount<0;
        if (amount.compareTo(getBalance().add(creditLimit))> 0){
            throw new Exception("No sufficient funds exception");
        }
        BigDecimal balanceBeforeOperation = getBalance();
        Bank bank = NationalBank.getInstance().getByName(bankName);
        Account account = bank.getByNumber(accountNumber);
        BigDecimal balanceBeforeOperationForTargetAccount =account.getBalance();
        topUp(amount.negate());
        account.topUp(amount);
        addTransactionLog(date.getTime(),"transfer Money",balanceBeforeOperation,getBalance());
        addTransactionLog(date.getTime(),"transfer Money",balanceBeforeOperationForTargetAccount,getBalance());
        System.out.println("You have apply "+getPercents()+"% on account balance. The balance now is: "+getBalance());
        return null;
    }
}


