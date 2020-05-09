package Bank;

import java.math.BigDecimal;
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

    public Account(BigDecimal percents) {
        balance = BigDecimal.ZERO;
        //lastAccountNumber++;
        accountNumber=++lastAccountNumber;
        this.percents=percents;
        transactionHistory = new ArrayList<>();
    }
    Date date = new Date();
    public BigDecimal topUp(BigDecimal amount){
        balance = balance.add(amount);
        return balance;
    }

    public void addTransactionLog(long time, String transName, BigDecimal balanceBeforeOperation, BigDecimal balance){
        transactionHistory.add(time +" "+transName +" Balance before operation: "+balanceBeforeOperation+"," +
                " Balance after operation: "+balance);
    }

    public List<String> getTransactionHistory() {
        System.out.println(transactionHistory.toString());
        return null;
    }

    public abstract void withDraw(BigDecimal amount);

    public abstract BigDecimal applyPercentage();

    public abstract BigDecimal transferMoney(String bankName, int accountNumber, BigDecimal amount) throws Exception;

    public BigDecimal getBalance(){
        return balance;
    }
    public BigDecimal getPercentsAsMultiplier(){
        return percents.divide(BigDecimal.valueOf(100)).add(BigDecimal.ONE);
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
