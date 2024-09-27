package Account;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long accountNumber;
    private String accountName;
    private  double money;
    public static final double Interest = 0.0035;


    public Account(){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.money = 50.0;
    }

    public Account(long accountNumber, String accountName, double money) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String account_name) {
        this.accountName = accountName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double calculateInterest(){
        return money * Interest;
    }

    public void setInterest(){
        money += money + Interest;
    }



    public void deposit(double amount) {
        if (amount > 0) {
            money += amount;
            System.out.println("Deposit successful! New balance: " + money);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public double withdrow (double amount, double fee){
        if ((amount + fee <= money) && (amount > 0)){
            money -= (amount + fee);
        }
        return amount;
    }



    public String toString() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));

        return "Account Number: " + accountNumber + "\n" +
                "Account Name: " + accountName + "\n" +
                "Your balance: " + currencyFormatter.format(money) + "\n" +
                "Interest: " + currencyFormatter;
    }


}

