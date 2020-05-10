import java.util.*;

public class Atm {
public static void main(String[] args) {
	       
	Account Uzair = new Account("Ahmed", 1000);
	Account Dharmin = new Account("Dharmin",2000);
	Account Arshjit = new Account("Arshjit",4000);
	    
  	int inaccount;
        int account=-1;
        int total=0;
        int total2=0;
        int total3=0;
        int choice=1;
        int desposit;
        int withdraw;
        int accounttotransfer;
        int transfer;
	String inpassword="";
	   
        Scanner z= new Scanner(System.in);
               
        System.out.println("Please enter your password ");
        String password = z.next();

        if (password.equals(Uzair.getPassWord())) {
        System.out.println(Uzair);
        account=1;
        }
		
        if (password.equals(Dharmin.getPassWord())) {
        System.out.println(Dharmin);
        account=2;
         }
        
        if (password.equals(Arshjit.getPassWord())) {
        System.out.println(Arshjit);
        account=3;
        }
        
	choice = z.nextInt();
        
        do{
            
	switch(choice){        
                
        case 1:
                    
        if(account==1){
                        
        System.out.println("Enter amount to desposit");
        desposit=z.nextInt();
        Uzair.setMoney((desposit + Uzair.getMoney()));
        total = Uzair.getMoney();
        System.out.println("Money in bank " +total);
        System.out.println(Uzair);
        choice=z.nextInt();          
        }
            
	if(account==2){
	System.out.println("Enter amount to desposit");
        desposit=z.nextInt();
        Dharmin.setMoney((desposit + Dharmin.getMoney()));
        total2 = Dharmin.getMoney();
        System.out.println("Money in bank " +total2);
        System.out.println(Uzair);
        choice=z.nextInt();
        }
        
	if(account==3){
        System.out.println("Enter amount to desposit");
        desposit=z.nextInt();
        Arshjit.setMoney((desposit + Arshjit.getMoney()));
        total2 = Arshjit.getMoney();
        System.out.println("Money in bank " +total3);
        System.out.println(Uzair);
        choice=z.nextInt();
        }
        //desposit=0;
        break;
                    
        case 2:
        System.out.println("Which account would you like to transfer too");
        accounttotransfer=z.nextInt();
        System.out.println("How much would you like to transfer");
        transfer=z.nextInt();
        if(account==1 && accounttotransfer==2 && Uzair.getMoney()>=transfer){
        Uzair.setMoney((Uzair.getMoney()-transfer));
        Dharmin.setMoney((Dharmin.getMoney()+transfer));
        }
        
	if(account==1 && accounttotransfer==3 && Uzair.getMoney()>=transfer){
        total=total-transfer;
        total3=total3+transfer;
        }
		
        if(account==2 && accounttotransfer==1 && Dharmin.getMoney()>=transfer){
        total2=total2-transfer;
        total=total+transfer;
        }
        
	if(account==2 && accounttotransfer==3 && Dharmin.getMoney()>=transfer){
        total2=total2-transfer;
        total3=total3+transfer;
        }
        
	if(account==3 && accounttotransfer==1 && Arshjit.getMoney()>=transfer){
        total3=total3-transfer;
        total=total+transfer;
        }
        if(account==3 && accounttotransfer==2 && Arshjit.getMoney()>=transfer){
        total3=total3-transfer;
        total2=total2+transfer;
        }
		
        else{
        System.out.println("Invalid");
			}
        transfer=0;
        System.out.println(Uzair);
        choice=z.nextInt();
                    
        break;
				
        case 3:
		
        if(account==1){
        System.out.println("Your current balance is "+Uzair.getMoney());
        System.out.println(Uzair);
        choice=z.nextInt();
                    }
        if(account==2){
        System.out.println("Your current balance is "+Dharmin.getMoney());
        System.out.println(Dharmin);
        choice=z.nextInt();
        }
		
        if(account==3){
        System.out.println("Your current balance is "+Arshjit.getMoney());
        System.out.println(Arshjit);
        choice=z.nextInt();
        }
        break;
		
	case 4:
	break;
		
	case 5:
    	
	account=-1;
        
	while(account>3 || account<0){
        System.out.println("\nPlease select an account");
	System.out.println("\n(1)Uzair \n(2)Dharmin \n(3)Arshjit" );
        inpassword=z.nextLine();
        
	if(inpassword.equals("1")){
        account=1;
        }
        
	if(inpassword.equals("2")){
        account=2;
        }
        
	if(inpassword.equals("3")){
        account=3;
        }
        }
        
	System.out.println(Uzair);
        choice=z.nextInt();
        break;
                
	case 6:
        System.exit(0);
        break;
        
	}
        	
	}
	while(true);

	}
}
