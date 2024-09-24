/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Admin
 */
public class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void deposit(double amout) {
        if(amout > 0) {
            balance += amout;
            System.out.println("Số tiền đã gửi là: " + amout + ". Số dư mới của tài khoản:  " + balance);
        }
        else {
            System.out.println("Số tiền gửi phải lớn hơn không");
        }
    }
    
    public void withdraw(double amout) {
        if(amout > 0 && amout <= balance){
            balance -= amout;
            System.out.println("Số tiền đã rút là: "+ amout + ". Số dư mới của tài khoản: " + balance);
        }
        else System.out.println("Số tiền không hợp lệ");
      
    }
    
    public void displayBalance() {
        System.out.println("Số tài khoản của bạn là: "+ accountNumber + ", số dư tài khoản là: "+ balance);
    }
    
}
