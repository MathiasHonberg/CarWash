import java.util.*;
public class Costumer{

   private String name;
   private int number;
   private Costumer[] costumers;
   private int code;
   //private WashCard washcard;
   
   //Constructor
   public Costumer(String name, int number, int code){
   
      this.name = name;
      this.number = number;
      this.code = code;
      //this.washcard = washcard;
         
   }
   
   
   public void displayCostumer(){
   
   System.out.println("Costumer: ");
   System.out.println("\tName: \t\t\t" + name);
   System.out.println("\tPhone-number: \t" + number);
   System.out.println("\tCode: \t\t\t" + code);
         
   }
   
   public String getName(){
   
   return this.name;
   }   
   
   public int getNumber(){
   
      return this.number;
   }
   
   public int getCode(){
   
      return this.code;
   }
   
   public void setNumber(int number){
   
      this.number = number;
   }
   
   public void setName(String name){
   
      this.name = name;
   }
   
   public void setCode(){
   
      this.code = (int) (Math.random() * 900 + 100);
   }
   

}