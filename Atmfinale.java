import java.util.*;

public class Atmfinale{
	public static void main(String[] args) {
	    
	    Scanner z= new Scanner(System.in);
	    
	    
	    Account uzair = new Account("Ahmed", 1000);
	    Account Dharmin = new Account("Dharmin",1000);
	    Account Arshjit = new Account("Arshjit",1000);
	    
	    
	   
	    
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
	    String options= "1 switch accounts, 2 desposit, 3 transfer, 4 withdraw, 5 print balance, 6 to exit";
               
             System.out.println("Please enter your password ");
       String password = z.next();

        while (!password.equals(uzair.getPassWord())) {
            System.out.println("Try again");
            password = z.next();
        }

        if (password.equals(uzair.getPassWord())) {
            System.out.println(uzair);
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
                        uzair.setMoney((desposit + uzair.getMoney()));
                        total = uzair.getMoney();
                        System.out.println("Money in bank " +total);
                        System.out.println(options);
                        choice=z.nextInt();
                    }
                    if(account==2){
                        System.out.println("Enter amount to desposit");
                        desposit=z.nextInt();
                        Dharmin.setMoney((desposit + Dharmin.getMoney()));
                        total2 = Dharmin.getMoney();
                        System.out.println("Money in bank " +total2);
                        System.out.println(options);
                        choice=z.nextInt();
                    }
                    if(account==3){
                        System.out.println("Enter amount to desposit");
                        desposit=z.nextInt();
                        Arshjit.setMoney((desposit + Arshjit.getMoney()));
                        total2 = Arshjit.getMoney();
                        System.out.println("Money in bank " +total3);
                        System.out.println(options);
                        choice=z.nextInt();
                    }
                    //desposit=0;
                    break;
                    
                case 2:
                    System.out.println("Which account would you like to transfer too");
                    accounttotransfer=z.nextInt();
                    System.out.println("How much would you like to transfer");
                    transfer=z.nextInt();
                    if(account==1 && accounttotransfer==2 && uzair.getMoney()>=transfer){
                        uzair.setMoney((uzair.getMoney()-transfer));
                        Dharmin.setMoney((Dharmin.getMoney()+transfer));
                    }
                    if(account==1 && accounttotransfer==3 && uzair.getMoney()>=transfer){
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
                    System.out.println(options);
                    choice=z.nextInt();
                    
                    break;
               
         
                case 3:
                    if(account==1){
                        System.out.println(uzair.getMoney());
                        System.out.println(options);
                        choice=z.nextInt();
                    }
                    if(account==2){
                        System.out.println(Dharmin.getMoney());
                        System.out.println(options);
                        choice=z.nextInt();
                    }
                    if(account==3){
                        System.out.println(Arshjit.getMoney());
                        System.out.println(options);
                        choice=z.nextInt();
                    }
                    break;
               
                case 4:
                    System.exit(0);
                    break;
            }
        }
		while(true);
	}
}