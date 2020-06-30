package Bank;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CreditAccount extends Account {
    private BigDecimal creditLimit;

    public CreditAccount(BigDecimal percents, BigDecimal creditLimit) {
        super(percents);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withDraw(BigDecimal amount) throws Exception {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new NegativeValueException("The value of amount to withDraw cannot be negative");
        }
        BigDecimal balanceBeforeOperation = getBalance();
        if (amount.compareTo(getBalance().add(creditLimit)) <= 0) {
            topUp(amount.negate(),false);
            addTransactionLog(LocalDateTime.now(), "WithDraw", balanceBeforeOperation, getBalance());
            System.out.println("You have withdrawn " + amount + ". The balance now is: " + getBalance());
        }
        if (amount.compareTo(getBalance().add(creditLimit)) > 0) {
            throw new Exception("No sufficient funds exception");
        }
    }


    @Override
    public BigDecimal applyPercentage() throws NegativeValueException {
        BigDecimal balanceBeforeOperation = getBalance();
        topUp(getBalance().multiply(BigDecimal.valueOf(0.01)),false);
        addTransactionLog(LocalDateTime.now(), "ApplyPercents", balanceBeforeOperation, getBalance());
        System.out.println("You have apply " + getPercents() + "% on account balance. The balance now is: " + getBalance());
        return null;
    }

    @Override
    public BigDecimal transferMoney(String bankName, int accountNumber, BigDecimal amount) throws Exception, NegativeValueException {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new NegativeValueException("The value of amount to transfer cannot be negative");
        }
        if (amount.compareTo(getBalance().add(creditLimit)) > 0) {
            throw new Exception("No sufficient funds exception");
        }
        BigDecimal balanceBeforeOperation = getBalance();
        Bank bank = NationalBank.getInstance().getByName(bankName);
        Account account = bank.getByNumber(accountNumber);
        BigDecimal balanceBeforeOperationForTargetAccount = account.getBalance();
        topUp(amount.negate(),false);
        account.topUp(amount,false);
        addTransactionLog(LocalDateTime.now(), "transfer Money to the different account", balanceBeforeOperation, getBalance());
        account.addTransactionLog(LocalDateTime.now(), "Getting transfer of money from different account", balanceBeforeOperationForTargetAccount, account.getBalance());
        System.out.println("You have transfer "+amount+" to account number "+ accountNumber);
        return null;
    }
}
