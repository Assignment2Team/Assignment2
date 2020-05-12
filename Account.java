/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atm;

/**
 *
 * @author Uzair
 */

class Account {
	
    private String password;	
    private double total;
    private double deposit;
    
    public Account(String password,double money){
        
        this.password = password;
	    this.total = money;
    }
    public double getMoney(){
        return total;
    }
    public void setMoney(double newMoney){
      total= newMoney;
    }
    public String getPassWord(){
        return password;
    }
      public String toString(){
        return "*********************************************" 
                 
         + "\nPlease select one of the options below "	 
		 + "\nPress (1) to  Switch Accounts"
		 + "\nPress (2) to Deposit (2 decimal places)"
        	 +"\nPress (3) Transfer (2 decimal places)"  
		 + "\nPress (4) to  Withdraw (2 decimal places)" 
		 +"\nPress (5) to Print balance"
		 +"\nPress (6) to Exit";
      }
}
