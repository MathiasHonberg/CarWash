import java.util.*;
public class Costumer{

   private String name;
   private String number;
   private int card;
   private Costumer[] costumers;
   private int code;
   //private WashCard washcard;
   
   //Constructor
   public Costumer(int card, String name, String number, int code /*WashCard washcard*/){
   
      this.card = card;
      this.name = name;
      this.number = number;
      this.code = code;
      //this.washcard = washcard;
         
   }
   
   
   public void displayCostumer(){
   
   System.out.println("Costumer: " + card);
   System.out.println("\tName: \t\t\t" + name);
   System.out.println("\tPhone-number: \t" + number);
   System.out.println("\tCode: \t\t\t" + code);
         
   }
   
   public String getName(){
   
   return this.name;
   }   
   
   public String getNumber(){
   
      return this.number;
   }
   
   public int getCode(){
   
      return this.code;
   }
   
   public void setNumber(String number){
   
      this.number = number;
   }
   
   public void setName(String name){
   
      this.name = name;
   }
   
   public void setCode(){
   
      this.code = (int) (Math.random() * 999 + 100);
   }
   

}