/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 */
public class Atmfinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Accounts uzair = new Accounts("Ahmed",10000);
        //Accounts dharmin = new Accounts("Patel",1000);
        

        Scanner sc = new Scanner(System.in);
       
        System.out.println("Please enter your password ");
       String password = sc.next();

        while (!password.equals(uzair.getPassWord())) {
            System.out.println("Try again");
            password = sc.next();
        }

        if (password.equals(uzair.getPassWord())) {
            System.out.println(uzair);
        }
        
            int choice = sc.nextInt();
            
            do {
            switch (choice) {
                
                case 1:
                    System.out.println("Please enter the amount of money you want to deposit");
                    int deposit = sc.nextInt();
                    uzair.setMoney((deposit + uzair.getMoney()));
                    int total = ((deposit + uzair.getMoney()));
                      System.out.println("Money in bank " +total);
                    
                    break;
                case 2:
                    System.out.println("How much would like to withdraw");
                    int withdraw = sc.nextInt();
                    int balance = uzair.getMoney() - withdraw;
                    System.out.println("You withdrew : " +withdraw);
                    break;
                
                case 3:
                    System.out.println("Your current balance is: " +(uzair.getMoney()));
                    break;
                case 4:
                    System.out.println("Please select an account " + "\n(1)Patel " + "\n(2)Arsh ");
                    int Transfer = sc.nextInt();
                    break; 
                
                case 5:
                    System.exit(0);
                    break;    
                    }
            }
            while(true);
                   
                     }
        } 

        
    
