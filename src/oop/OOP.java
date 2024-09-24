/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop;

/**
 *
 * @author Admin
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Customer customer = new Customer("Trang");
       
       SavingAccount savings = new SavingAccount(4.8, "0364075592", 100000000);
       CheckingAccount checkingAccount = new CheckingAccount(0, "0364075592", 5000000);
       
       customer.addAccount(savings);
       customer.addAccount(checkingAccount);
       
       savings.deposit(2000000000);
       checkingAccount.withdraw(50000000);
       
       savings.applyInterest();
       customer.displayAccounts();
    }
    
}
