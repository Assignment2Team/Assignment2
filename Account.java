import java.util.*;

public class Account {
	
    private String password;	
    private int money;
    private int deposit;
    private int withdraw;
    
    public Accounts (String password,int money){
        
        this.password = password;
	this.money = money;
    }
      
    public int getMoney(){
        return money;
    }
		
	
    public void setMoney(int newMoney){
      mnoey = newMoney;
    }
	
    
    public String getPassWord(){
        return password;
    }
           
	        
    @Override
    public String toString(){
        return "*********************************************" 
                 
                 + "\nPlease select one of the options below "	 
		 + "\nPress (1) to  deposit"
		 + "\nPress (2) to transfer money"
          	 +"\nPress (3) to withdraw"  
		 + "\nPress (4) to  print balance" 
		 +"\nPress (5) to switch accounts"
		 +"\nPress (6) to exit";
                 
    }
    
}
