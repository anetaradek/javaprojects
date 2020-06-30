package Bank;

import java.math.BigDecimal;

public class BankApplication {
    private static final String ALIOR_BANK_NAME = "Alior Bank";
    private static final String MBANK_BANK_NAME = "mBank";

    public static void main(String[] args) throws NegativeValueException {
        init();
    }

    private static void init() throws NegativeValueException {
        NationalBank nb = NationalBank.getInstance();

        Bank alior = new Bank(ALIOR_BANK_NAME);
        Bank mbank = new Bank(MBANK_BANK_NAME);


        nb.registerBank(alior);
        nb.registerBank(mbank);

        Account aliorDeposit = new DepositAccount(BigDecimal.valueOf(0.5));
        System.out.println(aliorDeposit.toString());
        Account aliorCredit = new CreditAccount(BigDecimal.valueOf(8), BigDecimal.valueOf(10_000));
        System.out.println(aliorCredit.toString());
        alior.addAccount(aliorCredit);
        alior.addAccount(aliorDeposit);

        Account mbankDeposit = new DepositAccount(BigDecimal.valueOf(0.45));
        System.out.println(mbankDeposit.toString());
        Account mbankCredit = new CreditAccount(BigDecimal.valueOf(6), BigDecimal.valueOf(5_000));
        System.out.println(mbankCredit.toString());
        mbank.addAccount(mbankCredit);
        mbank.addAccount(mbankDeposit);
        try {
            aliorCredit.topUp(BigDecimal.valueOf(2000),true);
        }
        catch (NegativeValueException e){
            System.out.println(e);
        }
        try{
            aliorDeposit.topUp(BigDecimal.valueOf(1000),true);
        }
        catch (NegativeValueException e){
            System.out.println(e);
        }
        try {
            mbankCredit.topUp(BigDecimal.valueOf(3000),true);
        }
        catch (NegativeValueException e){
            System.out.println(e);
        }
        try {
            mbankDeposit.topUp(BigDecimal.valueOf(4000),true);
        }
        catch (NegativeValueException e){
            System.out.println(e);
        }


        try {
            aliorCredit.withDraw(BigDecimal.valueOf(-100));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            aliorCredit.withDraw(BigDecimal.valueOf(200));
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            aliorDeposit.transferMoney(mbank.getName(), mbankCredit.getAccountNumber(), BigDecimal.valueOf(200));
        } catch (Exception e) {
            System.out.println(e);
        }

        mbankDeposit.applyPercentage();
        aliorDeposit.applyPercentage();


        try {
            aliorCredit.transferMoney(mbank.getName(), mbankDeposit.getAccountNumber(), BigDecimal.valueOf(-100));
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println(aliorCredit.getTransactionHistory());
        System.out.println(aliorDeposit.getTransactionHistory());
        System.out.println(mbankCredit.getTransactionHistory());
        System.out.println(mbankDeposit.getTransactionHistory());
    }
}