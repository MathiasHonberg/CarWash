public class WashType{

   private String name;
   private double price;
   private int number;
   private WashType[] washTypes;
   
   
   public WashType(String name, double price, int number){
   
      this.name = name;
      this.price = price;
      this.number = number;
   
   }
   
   public String getName(String name){
   
      return this.name;
   }
   
   public double price(double price){
   
      return this.price;   
   }

   public void setName(){
   
      this.name = name;
   }
   
   public void setPrice(){
   
      this.price = price;
   }
   
   public void displayWash(){
   
      System.out.println("Washtype: " + number);
      System.out.println("\tName: \t" + name);
      System.out.println("\tPrice: \t" + price + "kr.");
     
   }
}