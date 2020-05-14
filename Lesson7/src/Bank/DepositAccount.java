package Bank;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DepositAccount extends Account {
    public DepositAccount(BigDecimal percents) {
        super(percents);
    }

    @Override
    public void withDraw(BigDecimal amount) throws NegativeValueException, Exception {
        BigDecimal balanceBeforeOperation = getBalance();
        if (amount.compareTo(BigDecimal.ZERO)<0){
            throw new NegativeValueException("The value of amount to transfer cannot be negative");
        }
        if (amount.compareTo(getBalance())>0){
            throw new Exception("No sufficient funds on account");
        }
        if(amount.compareTo(getBalance())<=0){
            setBalance(amount.negate().add(getBalance()));
            addTransactionLog(LocalDateTime.now(), "WithDraw", balanceBeforeOperation, getBalance());
            System.out.println("You have withdrawn "+amount+". The balance now is: "+getBalance());
        }
    }

    @Override
    public BigDecimal applyPercentage() throws NegativeValueException {
        BigDecimal balanceBeforeOperation = getBalance();
        setBalance(getBalance().multiply(getPercentsAsMultiplier()));
        addTransactionLog(LocalDateTime.now(),"ApplyPercents",balanceBeforeOperation,getBalance());
        System.out.println("You have apply "+getPercents()+"% on account balance. The balance now is: "+getBalance());
        return null;
    }

    @Override
    public BigDecimal transferMoney(String bankName, int accountNumber, BigDecimal amount) throws Exception, NegativeValueException {
        if (amount.compareTo(BigDecimal.ZERO)<0){
            throw new NegativeValueException("The value of amount to transfer cannot be negative");
        }
        if (amount.compareTo(getBalance())> 0){
            throw new Exception("No sufficient funds exception");
        }
        BigDecimal balanceBeforeOperation = getBalance();
        Bank bank = NationalBank.getInstance().getByName(bankName);
        Account account = bank.getByNumber(accountNumber);
        BigDecimal balanceBeforeOperationForTargetAccount =account.getBalance();
        setBalance(amount.negate().add(getBalance()));
        account.setBalance(amount.add(account.getBalance()));
        addTransactionLog(LocalDateTime.now(),"transfer Money",balanceBeforeOperation,getBalance());
        account.addTransactionLog(LocalDateTime.now(),"transfer Money",balanceBeforeOperationForTargetAccount,
                account.getBalance());
        System.out.println("You have apply "+getPercents()+"% on account balance. The balance now is: "+getBalance());
        return null;
    }
}