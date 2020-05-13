/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atm;

/**
 *
 * @author Arshjit Sansoe
 */
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
    "\n*Five(s):              "+ five        +
    "\n**********************************";
  }
}
