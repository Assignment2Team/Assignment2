import java.util.*;

public class Accounts {
    private String username;
    private String password;
    private int money;
    private int deposit;
    private int withdraw;
    
    public Accounts (String username, String password, int money){
        this.username = username;
        this.password = password;
        this.money = money;
    }
    
    public String getUserName(){
        return username;
     
    }
    
    public String getPassWord(){
        return password;
    }
    
    public int getMoney(){
        return money;
    }
    
    public void setMoney(int newMoney){
        money = newMoney;
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
