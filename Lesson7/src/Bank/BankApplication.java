package Bank;

import java.math.BigDecimal;
import java.util.Date;

public class BankApplication {
    private static final String ALIOR_BANK_NAME = "Alior Bank";
    private static final String MBANK_BANK_NAME = "mBank";

    public static void main(String[] args)
    {
        init();
    }
    private static void init(){
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

        aliorCredit.withDraw(BigDecimal.valueOf(100));
        try {
            mbankDeposit.transferMoney(mbank.getName(), mbankCredit.getAccountNumber(), BigDecimal.valueOf(200));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}