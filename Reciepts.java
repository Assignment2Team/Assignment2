/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atm;

/**
 *
 * @author Nanu
 */
public class Reciepts {
    
    private int[] bills = {100,50,20,10,5};
    private int hundred=0;int fifty=0;int twenty=0;int ten=0;int five=0;
    private String recipts;	
    
    public Reciepts (String recipts){
        
        this.recipts = recipts;
	
    }
      		
	
    public String getRecepts(){
        return recipts;
    }
    
     public String toString() {
        return "*******************************************"
                + "\n ***********>>>Vanier BANK<<<***********"
                + "\n *----------Transaction  Receipt**********"
                + "\n*******************************************"
                + "\n*******************************************";
    }
     
      public String withdraw() {
          
           return  "************************************"+
                "\n*Hundred:           "+ hundred     + 
                "\n*Fifties:           " + fifty      +
                "\n*Twenties:  "        + twenty  +
                "\n*Tens:        "      +ten  +
                 "\n*Fives:        "    +five  +   
                "\n**********************************";      
    }
    
    //public boolean equals(Reciepts book2){
    //if (password.equals(book2.publisher) && bookAmount == book2.bookAmount){
    //return true;
    //} 
    //else {
    //return false;
    }
                    
                     

