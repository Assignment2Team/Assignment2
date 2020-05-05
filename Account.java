import java.util.*;

public class Account {
    private int money;
    private int deposit;
    private int withdraw;
    
    public Accounts (int money, int deposit,int withdraw){
        
	this.money = money;
	this.money = deposit;
	this.money = withdraw;
    }
      
    public int getMoney(){
        return money;
    }
		
    public int getMoney(){
        return money;
    }
	
    public int getMoney(){
        return money;
    }
    
    public void setMoney(int newMoney){
        money = newMoney;
    }
    
    public void setDeposit(int newDeposit){
        deposit = newDeposit;
    }
     public void setWithdraw(int newWithdraw){
       withdraw = newWithdraw;
    }
        	
        
	        
    @Override
    public String toString(){
        return "-------------------------------------" 
                 
                 + "\nPlease select one of the options below "	 
		 + "\nPress (1) to  deposit"
		 + "\nPress (2) to transfer money"
          	 +"\nPress (3) to withdraw"  
		 + "\nPress (4) to  print balance" 
		 +"\nPress (5) to switch accounts"
		 +"\nPress (6) to exit";
                 
    }
    
}
