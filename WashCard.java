public class WashCard{

   private double balance;
   
   
   //set balance to 0.0
  
   public WashCard(){
      balance = 0.0;
   
   }
   
   //deposit
   public void deposit(double amount){
      balance = balance + amount;
   
   }
   
   //get balance
   public double getBalance(){
      return balance;
      
   }
   
   public void pay(double amount){
   
      balance = balance - amount;
   }

}