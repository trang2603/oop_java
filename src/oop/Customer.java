/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Customer {
    private String name;
    private List<BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }
    
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }
    
    public void displayAccounts() {
        System.out.println("Khách hàng: "+ name);
        for(BankAccount account: accounts) {
            account.displayBalance();
        }
    }
}
