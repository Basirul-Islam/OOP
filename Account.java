/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Bashir
 */
public class Account {
    private String userName,userId,addresss,NID;
    private double balance;
    public Account(String userId,double balance,String Address,String NID  ){
        this.userId = userId;
        this.balance = balance;
        this.addresss = Address;
        this.NID = NID;
    }
    public double deposit(double ammount){
        if(balance>0 && ammount >0)
        balance = balance + ammount;
        else System.out.println("Invalid Ammount!!!");
        return balance;
    }
    public double withdraw(double ammount){
        if(balance>=ammount && ammount>0 && balance>0) 
        balance = balance - ammount;
        else System.out.println("Invalid Ammount!!!");
        return balance;
    }
    public void setName(String Name){
        this.userName = Name;
    }
    
}
