/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atm;

import java.util.*;
import java.util.Arrays;
/**
 * @author Dharmin Patel,Uzair Lakhani and Arshjit Sansoe
 * runs class Bank
 * 
*/

public class Mainatm2{
    public static void main(String[] args){
        Bank name= new Bank();
        Bank.Vanier();
    }
}
/*
 * Has 6 cases Switch accounts,Deposit,Transfer,Withdraw,Print balance,exit
 * 
*/
class Bank{
  public static void Vanier() {

    Scanner sc = new Scanner(System.in);

    Accountfinal uzair = new Accountfinal("Uzair Lakhani",1234, 19034.59);//Accounts uses account class
    Accountfinal dharmin = new Accountfinal("Dharmin Patel",5678,53401.67);
    Accountfinal arshjit = new Accountfinal("Arshjit Sansoe",9012,20670.34);
    
    Receipt receipt = new Receipt(0,0,0,0,0);//Used for printing the receipt


    System.out.println("\n\t * ~ Welcome to the Bank of Vanier ~ *\n");

    int[] bills = {100,50,20,10,5};//Uses Arrays for Bills 
    int inaccount;
    int account=-1;
    int choice=1;
    int accounttotransfer;
    int pinNumber;
    double deposit;
    double withdraw;
    double total=0, total2=0, total3=0;
    double transfer;
    double amountwithdrawn;

    do{
      switch(choice){
        case 1:
        account=-1;
        while(account>3 || account<0){
          System.out.print("Enter your pin number: ");//Pin number is the second value of class account ex: 1234 for uzair
          pinNumber = sc.nextInt();
          if(pinNumber == uzair.getPinNumber()){
            account=1;
            System.out.println("User's name: " +uzair.getUserName());
          }
          if(pinNumber == dharmin.getPinNumber()){
            account=2;
            System.out.println("User's name: " +dharmin.getUserName());
          }
          if(pinNumber == arshjit.getPinNumber()){
            account=3;
            System.out.println("User's name: " +arshjit.getUserName());
          }
        }
        System.out.println(arshjit);//prints options
        choice = sc.nextInt();//allows user to switch cases
        break;

        case 2:
          System.out.println("Enter amount to deposit");
          System.out.print("$");
          deposit = sc.nextDouble();
        if(account==1){
          uzair.setMoney(deposit + uzair.getMoney());
          total = uzair.getMoney();
          System.out.println("Money in bank: " +total);
        }
        if(account==2){
          dharmin.setMoney((deposit + dharmin.getMoney()));
          total2 = dharmin.getMoney();
          System.out.println("Money in bank " +total2);
        }
        if(account==3){
          arshjit.setMoney((deposit + arshjit.getMoney()));
          total2 = arshjit.getMoney();
          System.out.println("Money in bank " +total3);
        }
        System.out.println(arshjit);
        choice = sc.nextInt();
        deposit=0;
        break;

        case 3:
        System.out.println("Which account would you like to transfer to?");
        accounttotransfer = sc.nextInt();
        System.out.println("How much would you like to transfer?");
        transfer = sc.nextDouble();
        if((transfer*100)%1!=0){
          System.out.println("Invalid more than 2 decimals");
          break;//Breaks loop here to force user to input valid value
        }
        if(accounttotransfer==account){
          System.out.println("You can't transfer money into your own account");
          break;//Same thing as above
        }
        if(account==1 && accounttotransfer==2 && uzair.getMoney()>=transfer && transfer>=0){
          uzair.setMoney((uzair.getMoney()-transfer));
          dharmin.setMoney((dharmin.getMoney()+transfer));
        }
        if(account==1 && accounttotransfer==3 && uzair.getMoney()>=transfer && transfer>0){
          uzair.setMoney((uzair.getMoney()-transfer));
          arshjit.setMoney((arshjit.getMoney()+transfer));
        }
        if(account==2 && accounttotransfer==1 && dharmin.getMoney()>=transfer && transfer>0){
          dharmin.setMoney((dharmin.getMoney()-transfer));
          uzair.setMoney((uzair.getMoney()+transfer));
        }
        if(account==2 && accounttotransfer==3 && dharmin.getMoney()>=transfer && transfer>0){
          dharmin.setMoney((dharmin.getMoney()-transfer));
          arshjit.setMoney((arshjit.getMoney()+transfer));
        }
        if(account==3 && accounttotransfer==1 && arshjit.getMoney()>=transfer && transfer>0){
          arshjit.setMoney((arshjit.getMoney()-transfer));
          uzair.setMoney((uzair.getMoney()+transfer));
        }
        if(account==3 && accounttotransfer==2 && arshjit.getMoney()>=transfer && transfer>0){
          arshjit.setMoney((arshjit.getMoney()-transfer));
          dharmin.setMoney((dharmin.getMoney()+transfer));
        }
        System.out.println("\nYou have successfully have transfered the money");
        transfer=0;//Resets value for next transfer 
        System.out.println(arshjit);
        choice = sc.nextInt();
        break;

        case 4:
          if(account==1){
            System.out.println("Current Balance: $ "+ uzair.getMoney());
          }
          if(account==2){
            System.out.println("Current Balance: $ "+ dharmin.getMoney());
          }
          if(account==3){
            System.out.println("Current Balance: $ "+ arshjit.getMoney());
          }
          System.out.println("You could only withdraw between $20 to $1000.");
          System.out.println("How much would you like to withdraw: ");
          System.out.print("$");
          
          withdraw = sc.nextDouble();
          amountwithdrawn=withdraw;

        while(withdraw>=20 && withdraw<=1000){
          while(withdraw>=bills[0]){
            withdraw-=bills[0];//Subtracts the first number of the array until it is less than it
            receipt.setHundreds((receipt.getHundred()+1));//increments the amount of 100s by 1 until withdraw>=100
          }
          while(withdraw>=bills[1]){
            withdraw-=bills[1];
            receipt.setFifty((receipt.getFifty()+1));
          }
          while(withdraw>=bills[2]){
            withdraw-=bills[2];
            receipt.setTwenty((receipt.getTwenty()+1));
          }
          while(withdraw>=bills[3]){
            withdraw-=bills[3];
            receipt.setTen((receipt.getTen()+1));
          }
          while(withdraw>=bills[4]){
            withdraw-=bills[4];
            receipt.setFive((receipt.getFive()+1));
          }
          if (withdraw != 0) {
            System.out.println("\n* ~ Warning, you have a small amount which will be transfered back into your account ~ *");
          }
          System.out.println(receipt.withdraw());//prints receipt
          if (withdraw != 0) {
            System.out.printf("Amount which will be put back into your account $%.2f. \n", withdraw);
          }
          if(account==1 && amountwithdrawn<=uzair.getMoney()){
            uzair.setMoney((uzair.getMoney()-amountwithdrawn+withdraw));
            System.out.println("New Balance: "+ uzair.getMoney());
          }
          if(account==2 && amountwithdrawn<=dharmin.getMoney()){
            dharmin.setMoney((dharmin.getMoney()-amountwithdrawn+withdraw));
            System.out.println("New Balance: "+ dharmin.getMoney());
          }
          if(account==3 && amountwithdrawn<=arshjit.getMoney()){
            arshjit.setMoney((arshjit.getMoney()-amountwithdrawn+withdraw));
            System.out.println("New Balance: "+ arshjit.getMoney());
          }
            receipt.setHundreds(0);receipt.setFifty(0);receipt.setTwenty(0);receipt.setTen(0);receipt.setFive(0);//resets values to 0 for next withdraw
            withdraw=0;
            System.out.println(arshjit);
            choice = sc.nextInt();
        }
        break;
        
        case 5:
        if(account==1){
          System.out.println("Money in Bank: "+ uzair.getMoney());//Uses Account class and returns money
        }
        if(account==2){
          System.out.println("Money in Bank: "+ dharmin.getMoney());
        }
        if(account==3){
          System.out.println("Money in Bank: "+ arshjit.getMoney());
        }
        System.out.println(arshjit);
        choice = sc.nextInt();
        break;

        case 6:
        System.exit(0);
      }
    } while(true);
  }
}

class Account {
  private int pinNumber;
  private double total;
  private double deposit;
  private String userName;

  public Account(String userName, int pinNumber, double money){
    this.pinNumber = pinNumber;
    this.total = money;
    this.userName = userName;
  }
  public void setUserName(String userName){
  }
  public String getUserName(){
    return userName;
  }
  public double getMoney(){
    return total;
  }
  public void setMoney(double newMoney){
    total= newMoney;
  }
  public int getPinNumber(){
    return pinNumber;
  }
  public String toString(){
    return "*********************************************"
    + "\nPlease select one of the options below: "
    + "\nPress (1) to  Switch Accounts"
    + "\nPress (2) to Deposit (2 decimal places)"
    +"\nPress (3) Transfer (2 decimal places)"
    + "\nPress (4) to  Withdraw (2 decimal places)"
    +"\nPress (5) to Print balance"
    +"\nPress (6) to Exit";
  }
}

class Receipts {
  private int hundred=0;int fifty=0;int twenty=0;int ten=0;int five=0;

  public Receipts (int hundred, int fifty, int twenty, int ten, int five){
    this.hundred=hundred;
    this.fifty=fifty;
    this.twenty=twenty;
    this.ten=ten;
    this.five=five;
  }
  public void setHundreds(int receipthundred){
    hundred=receipthundred;  
  }
  public void setFifty(int receiptFifty){
    fifty=receiptFifty;  
  }
  public void setTwenty(int receiptTwenty){
    twenty=receiptTwenty;  
  }
  public void setTen(int receiptTen){
    ten=receiptTen;  
  }
  public void setFive(int receiptFive){
    five=receiptFive;  
  }
  public int getHundred(){
      return hundred;
  }
  public int getFifty(){
      return fifty;
  }
  public int getTwenty(){
      return twenty;
  }
  public int getTen(){
      return ten;
  }
  public int getFive(){
      return five;
  }
  public String withdraw() {
    return  "************************************"+
    "\n*Hundred(s):           "+ hundred     +
    "\n*Fiftie(s):            "+ fifty       +
    "\n*Twentie(s):           "+ twenty      +
    "\n*Ten(s):               "+ ten         +
    "\n*Five(s):              "+ five         +
    "\n**********************************";
  }
}

