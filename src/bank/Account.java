/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author lanceramoutar
 */
public class Account {
    private double balance;
    // set balance to 0.00
    public Account(){
        balance = 0.0;
    }
    //deposit
    public void deposit(double amount){
        balance = balance + amount;
    }
    
    //withdraw
    public void withdraw(double amount){
        balance = balance - amount;
    }
    
    //get balance
    public double getBalance(){
        return balance;
    }
}
