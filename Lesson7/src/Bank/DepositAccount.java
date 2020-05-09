package Bank;

import java.math.BigDecimal;

public class DepositAccount extends Account {
    public DepositAccount(BigDecimal percents) {
        super(percents);
    }

    @Override
    public void withDraw(BigDecimal amount) {
        BigDecimal balanceBeforeOperation = getBalance();
        if(amount.compareTo(getBalance())<=0){
            topUp(amount.negate());
            addTransactionLog(date.getTime(), "WithDraw", balanceBeforeOperation, getBalance());
            System.out.println("You have withdrawn "+amount+". The balance now is: "+getBalance());
        }
        //else throw
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
        if (amount.compareTo(getBalance())> 0){
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
