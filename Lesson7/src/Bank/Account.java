package Bank;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public abstract class Account {
    private int accountNumber;
    private BigDecimal balance;
    private BigDecimal percents;

    private List<String> transactionHistory;
    private static int lastAccountNumber;
    DecimalFormat decimalFormat = new DecimalFormat("#.##########");

    public Account(BigDecimal percents) {
        balance = BigDecimal.ZERO;
        accountNumber = ++lastAccountNumber;
        this.percents = percents/100;
        transactionHistory = new ArrayList<>();
    }

    Date date = new Date();

    public BigDecimal topUp(BigDecimal amount) throws NegativeValueException {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new NegativeValueException("The value of topUp cannot be negative");
        }
        balance = balance.add(amount);
        return balance;
    }


    public void addTransactionLog(LocalDateTime time, String transName, BigDecimal balanceBeforeOperation, BigDecimal balance) {
        transactionHistory.add("\n" + time + " " + transName + " Balance before operation: " + balanceBeforeOperation + "," +
                " Balance after operation: " + decimalFormat.format(balance));
    }

    public void getTransactionHistory() {
        System.out.println(transactionHistory.toString());
    }

    public abstract void withDraw(BigDecimal amount) throws NegativeValueException, Exception;

    public abstract BigDecimal applyPercentage() throws NegativeValueException;

    public abstract BigDecimal transferMoney(String bankName, int accountNumber, BigDecimal amount) throws Exception, NegativeValueException;

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getPercents() {
        return percents;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber &&
                Objects.equals(balance, account.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance);
    }
}
