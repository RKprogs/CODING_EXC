package com.Assignment3;

import java.util.Scanner;

class Account {

    private int id;
    private String accountType;
    private double balance;

    public Account() {
        this.id = 0;
        this.accountType = "";
        this.balance = 0.0;
    }

    public Account(int id, String accountType, double balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public String getDetails() {
        return "\nAccount ID: " + id + "\n" +
                "Account Type: " + accountType + "\n" +
                "Balance: " + balance;
    }
}

class AccountDetails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Account Type: ");
        String accountType = scanner.nextLine();

        System.out.print("Enter Balance: ");
        double balance = scanner.nextDouble();

        Account account = new Account(id,accountType,balance);
        System.out.print("Enter amount to withdraw: ");
        double amountToWithdraw = scanner.nextDouble();

        System.out.println(account.getDetails());
        if (account.withdraw(amountToWithdraw)) {
            System.out.println("New balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
