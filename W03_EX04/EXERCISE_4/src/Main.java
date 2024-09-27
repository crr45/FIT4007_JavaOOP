
import Account.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your account name: ");
        String accountName = sc.nextLine();

        System.out.println("Enter your account number: ");
        long accountNumber = sc.nextLong();

        System.out.println("Enter the money in your account: ");
        double money = sc.nextDouble();

        Account account = new Account(accountNumber, accountName, money);
        System.out.println(account.toString());

    }
}