/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Admin
 */
public class CheckingAccount extends BankAccount{
    private double transactionFee;

    public CheckingAccount(double transactionFee, String accountNumber, double balance) {
        super(accountNumber, balance);
        this.transactionFee = transactionFee;
    }

    @Override
    public void withdraw(double amout) {
        if(amout > 0 && amout + transactionFee <= balance){
            balance -= (amout + transactionFee);
            System.out.println("Số tiền đã rút là: "+ amout + " với phí "+ transactionFee);
           
        }
        else {
            System.out.println("Số dư tài khoản không đủ");
        }
    }
    
    
}
