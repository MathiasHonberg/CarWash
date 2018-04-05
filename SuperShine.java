import java.util.*;
public class SuperShine{

   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      
      //Variables
      int counter = 0;
      int b = 0;
      int s = 0;
      int g = 0;
      int d = 0;
      double oms = 0;
      double revenue = 950.0;
      int ocode = 1337;
      
      //create WashCard
      WashCard mathiass = new WashCard();
      WashCard tobiass = new WashCard();
      
      //Create costumers
      Costumer mathias = new Costumer("Mathias", 5388849, 248);
      Costumer tobias = new Costumer("Tobias", 31707117, 228);

      
      //Create costumer array
      Costumer[] costumers = new Costumer[2];
      costumers[0] = new Costumer("Mathias", 53888494, 248);
      costumers[1] = new Costumer("Tobias", 31707117, 228);
      
      //create washtypes
      WashType[] washTypes = new WashType[4];
      washTypes[0] = new WashType("Bronze" , 200, 1);
      washTypes[1] = new WashType("Silver" , 300, 2);
      washTypes[2] = new WashType("Gold" , 400, 3);
      washTypes[3] = new WashType("Diamond" , 550, 4);
      
      mathiass.deposit(800);
      tobiass.deposit(150);
            
      //System.out.println(mathiass.getBalance() + " kr.");
      //System.out.println(tobiass.getBalance() + " kr");
      
      //After we create and acount
      Costumer alex = new Costumer("Alex", 70121416, 103);
      WashCard alexx = new WashCard();
      
      //The system that runs it all
      outerloop:
      while(true){
      System.out.println();
      System.out.println("Welcome to Supershine!");
      System.out.println("Please select one of the 4 options, by entering the number and press 'ENTER': \n"); 
      System.out.println("1: Wash your car\n2: Buy a WashCard\n3: Recharge and check balance on WashCard\n4: Exit\n5: Only for owner.");
      
      int select = scan.nextInt();
      
      if(select < 1 || select > 6){
         
            System.out.println("ERROR, CANNOT READ COMMAND.");
         }
      
      switch(select){
//If they choose option "Wash your Car"
         case 1: 
            System.out.print("Please enter your WashCard code: ");
            int code = scan.nextInt();
            //If they enter tobias's code
            if(code == tobias.getCode()){
              
              System.out.println("Hej " + tobias.getName() + "! What wash would you like to have?");
              washTypes[0].displayWash();
              washTypes[1].displayWash();
              washTypes[2].displayWash();
              washTypes[3].displayWash();
              
              int type = scan.nextInt();
              switch(type){
               //BRONZE WASH
               case 1:
                  System.out.println("You picked wash: 'Bronze', if you have enough money on your WashCard the wash will begin.");
                  if(tobiass.getBalance() >= 200){
                     
                     tobiass.pay(200);
                     System.out.println("Your wash is done!");
                     System.out.println("Your WashCard balance is now: " + tobiass.getBalance() + "\n");
                     counter++;
                     b++;
                     oms += washTypes[0].getPrice();
                     System.out.println("Do you like a receipt? yes=1    no=2 ");
                     int p = scan.nextInt();
                     if(p == 1){
                     
                        System.out.println("Bought:\n'Bronze' Wash\nPrice:\n200 on " + tobias.getName() + "'s Washcard");
                     }
                  }else{
                  
                     System.out.println("You dont have enough money on your WashCard.");
                  }
                  break;
               //SILVER WASH    
               case 2:
                  System.out.println("You picked wash: 'Silver', if you have enough money on your WashCard the wash will begin.");
                  if(tobiass.getBalance() >= 300){
                     
                     tobiass.pay(300);
                     System.out.println("Your wash is done!");
                     System.out.println("Your WashCard balance is now: " + tobiass.getBalance());
                     counter++;
                     s++;
                     oms += washTypes[1].getPrice();
                  }else{
                  
                     System.out.println("You dont have enough money on your card.");
                  }

                  break;
               //GOLD WASH   
               case 3:
                  System.out.println("You picked wash: 'Gold', if you have enough money on your WashCard the wash will begin.");
                  if(tobiass.getBalance() >= 400){
                     
                     tobiass.pay(400);
                     System.out.println("Your wash is done!");
                     System.out.println("Your WashCard balance is now: " + tobiass.getBalance());
                     counter++;
                     g++;
                     oms += washTypes[2].getPrice();
                  }else{
                  
                     System.out.println("You dont have enough money on your card.");
                  }

                  break;
               //DIAMOND WASH    
               case 4:
                  System.out.println("You picked wash: 'Diamond', if you have enough money on your WashCard the wash will begin.");
                  if(tobiass.getBalance() >= 550){
                     
                     tobiass.pay(550);
                     System.out.println("Your wash is done!");
                     System.out.println("Your WashCard balance is now: " + tobiass.getBalance());
                     counter++;
                     d++;
                     oms += washTypes[3].getPrice();
                  }else{
                  
                     System.out.println("You dont have enough money on your card.");
                  }

                  break;
              }
            //If they enter mathias's code  
            }else if(code == mathias.getCode()){
            
              System.out.println("Hej " + mathias.getName() + "! What wash would you like to have?"); 
              washTypes[0].displayWash();
              washTypes[1].displayWash();
              washTypes[2].displayWash();
              washTypes[3].displayWash();
              
              int type = scan.nextInt();
              switch(type){
              
               case 1:
                  System.out.println("You picked wash: 'Bronze', if you have enough money on your WashCard the wash will begin.");
                  if(mathiass.getBalance() >= 200){
                     
                     mathiass.pay(200);
                     System.out.println("Your wash is done!");
                     System.out.println("Your WashCard balance is now: " + mathiass.getBalance());
                     counter++;
                     b++;
                     oms += washTypes[0].getPrice();
                  }else{
                  
                     System.out.println("You dont have enough money on your card.");
                  }
                  break;
               case 2:
                  System.out.println("You picked wash: 'Silver', if you have enough money on your WashCard the wash will begin.");
                  if(mathiass.getBalance() >= 300){
                     
                     mathiass.pay(300);
                     System.out.println("Your wash is done!");
                     System.out.println("Your WashCard balance is now: " + mathiass.getBalance());
                     counter++;
                     s++;
                     oms += washTypes[1].getPrice();
                  }else{
                  
                     System.out.println("You dont have enough money on your card.");
                  }

                  break;
               case 3:
                  System.out.println("You picked wash: 'Gold', if you have enough money on your WashCard the wash will begin.");
                  if(mathiass.getBalance() >= 400){
                     
                     mathiass.pay(400);
                     System.out.println("Your wash is done!");
                     System.out.println("Your WashCard balance is now: " + mathiass.getBalance());
                     counter++;
                     g++;
                     oms += washTypes[2].getPrice();
                  }else{
                  
                     System.out.println("You dont have enough money on your card.");
                  }

                  break;
               case 4:
                  System.out.println("You picked wash: 'Diamond', if you have enough money on your WashCard the wash will begin.");
                  if(mathiass.getBalance() >= 550){
                     
                     mathiass.pay(550);
                     System.out.println("Your wash is done!");
                     System.out.println("Your WashCard balance is now: " + mathiass.getBalance());
                     counter++;
                     d++;
                     oms += washTypes[3].getPrice();
                  }else{
                  
                     System.out.println("You dont have enough money on your card.");
                  }

                  break;
              }

            }else if(code == alex.getCode()){
            
              System.out.println("Hej " + alex.getName() + "! What wash would you like to have?"); 
              washTypes[0].displayWash();
              washTypes[1].displayWash();
              washTypes[2].displayWash();
              washTypes[3].displayWash();
              
              int ttype = scan.nextInt();
              switch(ttype){
              
               case 1:
                  System.out.println("You picked wash: 'Bronze', if you have enough money on your WashCard the wash will begin.");
                  if(alexx.getBalance() >= 200){
                     
                     alexx.pay(200);
                     System.out.println("Your wash is done!");
                     System.out.println("Your WashCard balance is now: " + alexx.getBalance());
                     counter++;
                     b++;
                     oms += washTypes[0].getPrice();
                  }else{
                  
                     System.out.println("You dont have enough money on your card.");
                  }
                  break;
               case 2:
                  System.out.println("You picked wash: 'Silver', if you have enough money on your WashCard the wash will begin.");
                  if(alexx.getBalance() >= 300){
                     
                     alexx.pay(300);
                     System.out.println("Your wash is done!");
                     System.out.println("Your WashCard balance is now: " + alexx.getBalance());
                     counter++;
                     s++;
                     oms += washTypes[1].getPrice();
                  }else{
                  
                     System.out.println("You dont have enough money on your card.");
                  }

                  break;
               case 3:
                  System.out.println("You picked wash: 'Gold', if you have enough money on your WashCard the wash will begin.");
                  if(alexx.getBalance() >= 400){
                     
                     alexx.pay(400);
                     System.out.println("Your wash is done!");
                     System.out.println("Your WashCard balance is now: " + alexx.getBalance());
                     counter++;
                     g++;
                     oms += washTypes[2].getPrice();
                  }else{
                  
                     System.out.println("You dont have enough money on your card.");
                  }

                  break;
               case 4:
                  System.out.println("You picked wash: 'Diamond', if you have enough money on your WashCard the wash will begin.");
                  if(alexx.getBalance() >= 550){
                     
                     alexx.pay(550);
                     System.out.println("Your wash is done!");
                     System.out.println("Your WashCard balance is now: " + alexx.getBalance());
                     counter++;
                     d++;
                     oms += washTypes[3].getPrice();
                  }else{
                  
                     System.out.println("You dont have enough money on your card.");
                  }

                  break;
              }

            }else{
            
               System.out.println("You have entered a wrong code.");
            }
            
            break;
            
//If they choose option "Buy a WashCard"   
         case 2: 
            System.out.print("Please enter your name:");
               String navn = scan.nextString();
               alex.setName(navn);
               System.out.println();
            System.out.print("Please enter your Phone-number: ");
               int nummer = scan.nextInt();
               alex.setNumber(nummer);
               alex.setCode();
               System.out.println("Here is your personal information and your personal WashCard code: \n");
               alex.displayCostumer();
               
               System.out.print("Would you like to deposit money on your WashCard? yes=1    no=2 : ");
               int valg = scan.nextInt();
               System.out.println();
               if(valg == 1){
                  System.out.print("Enter amount up to 1000 kr. you want to deposit: ");
                  int dep = scan.nextInt();
                  if(dep > 0 && dep <= 1000){
                     alexx.deposit(dep);
                     revenue += dep;
                     System.out.println("Your WashCard balance is now: \n" + alexx.getBalance());
                     System.out.print("Would you like to buy a car wash? yes=1    no=2 : ");
                     int choose = scan.nextInt();
                     if(choose == 1){
                        System.out.println("What wash would you like to have?");
                        washTypes[0].displayWash();
                        washTypes[1].displayWash();
                        washTypes[2].displayWash();
                        washTypes[3].displayWash();
              
                        int wash = scan.nextInt();
                        switch(wash){
              
                        case 1:
                           System.out.println("You picked wash: 'Bronze', if you have enough money on your WashCard the wash will begin.");
                           if(alexx.getBalance() >= 200){
                     
                           alexx.pay(200);
                           System.out.println("Your wash is done!");
                           System.out.println("Your WashCard balance is now: " + alexx.getBalance());
                           counter++;
                           b++;
                           oms += washTypes[0].getPrice();
                        }else{
                  
                           System.out.println("You dont have enough money on your WashCard.");
                        }
                           break;
                        case 2:
                           System.out.println("You picked wash: 'Silver', if you have enough money on your WashCard the wash will begin.");
                           if(alexx.getBalance() >= 300){
                     
                              alexx.pay(300);
                              System.out.println("Your wash is done!");
                              System.out.println("Your WashCard balance is now: " + alexx.getBalance());
                              counter++;
                              s++;
                              oms += washTypes[1].getPrice();
                           }else{
                  
                              System.out.println("You dont have enough money on your card.");
                           }

                              break;
                        case 3:
                           System.out.println("You picked wash: 'Gold', if you have enough money on your WashCard the wash will begin.");
                           if(alexx.getBalance() >= 400){
                     
                              alexx.pay(400);
                              System.out.println("Your wash is done!");
                              System.out.println("Your WashCard balance is now: " + alexx.getBalance());
                              counter++;
                              g++;
                              oms += washTypes[2].getPrice();
                           }else{
                  
                              System.out.println("You dont have enough money on your card.");
                           }

                              break;
                        case 4:
                           System.out.println("You picked wash: 'Diamond', if you have enough money on your WashCard the wash will begin.");
                           if(alexx.getBalance() >= 550){
                     
                              alexx.pay(550);
                              System.out.println("Your wash is done!");
                              System.out.println("Your WashCard balance is now: " + alexx.getBalance());
                              counter++;
                              d++;
                              oms += washTypes[3].getPrice();
                           }else{
                  
                              System.out.println("You dont have enough money on your card.");
                           }

                              break;
                           }

                  }
                  }else{
               
                     System.out.println("You entered a invalid amount");
                  }
               }else if(valg == 2){
                  System.out.println("Bye, and have a nice day!");
               
               }else{
               
                  System.out.println("You entered a invalid number"); 
               }
               
               
            break;
//If they choose option "Recharge or check WashCard" 
         case 3:
            System.out.print("Please enter your WashCard code: ");
            int kkoder = scan.nextInt();
            if(kkoder == mathias.getCode()){
               System.out.print("Hey " + mathias.getName() + "! Your WashCard balance is: " + mathiass.getBalance());
               System.out.println();
               System.out.println("Do you want to recharge your WashCard? yes=1    no=2 : ");
               int answer = scan.nextInt();
               if (answer == 1){
                  System.out.print("Enter a amount up to 1000 kr, you want to deposit: ");
                  int deposit = scan.nextInt();
                  if(deposit > 0 && deposit <= 1000){
               
                     mathiass.deposit(deposit);
                     revenue += deposit;
                     System.out.println("Your WashCard balance is now: " + mathiass.getBalance());
                  break;
                  } else{
                  
                  System.out.println("You have entered a wrong amount.");   
                  }
               }else if(answer == 2){
               
                  System.out.println("Bye, and have a nice day!");
               }else{
               
                  System.out.println("You entered a invalid number");
               }
            
            }else if(kkoder == tobias.getCode()){
            
               System.out.print("Hey " + tobias.getName() + "! Your WashCard balance is: " + tobiass.getBalance());
               System.out.println();
               System.out.println("Do you want to recharge your WashCard? yes=1    no=2 : ");
               int answerr = scan.nextInt();
               if (answerr == 1){
                  System.out.print("Enter a amount up to 1000 kr, you want to deposit: ");
                  int depositt = scan.nextInt();
                  if(depositt > 0 && depositt <= 1000){
               
                     tobiass.deposit(depositt);
                     revenue += depositt;
                     System.out.println("Your WashCard balance is now: " + tobiass.getBalance());
                  
                  } else{
                  
                  System.out.println("You have entered a wrong amount.");   
                  }
               }else if(answerr == 2){
               
                  System.out.println("Bye, and have a nice day!");
               }else{
               
                  System.out.println("You entered a invalid number");
               }
            
            break;
            }else if(kkoder == alex.getCode()){
               System.out.print("Hey " + alex.getName() + "! Your WashCard balance is: " + alexx.getBalance());
               System.out.println();
               System.out.println("Do you want to recharge your WashCard? yes=1    no=2 : ");
               int aanswer = scan.nextInt();
               if (aanswer == 1){
                  System.out.print("Enter a amount up to 1000 kr, you want to deposit: ");
                  int ddeposit = scan.nextInt();
                  if(ddeposit > 0 && ddeposit <= 1000){
               
                     alexx.deposit(ddeposit);
                     revenue += ddeposit;
                     System.out.println("Your WashCard balance is now: " + alexx.getBalance());
                  
                  } else{
                  
                  System.out.println("You have entered a wrong amount.");   
                  }
               }else if(aanswer == 2){
               
                  System.out.println("Bye, and have a nice day!");
               }else{
               
                  System.out.println("You entered a invalid number");
               }
               break;
            }
//If the want to exit the program
         case 4:
            System.out.println("Bye, and have a nice day!");
            
            break outerloop;
//If the owner wants to see statistics      
         case 5:
            System.out.print("Please enter SS code: ");
            int sscode = scan.nextInt();
            if(sscode == ocode){
               System.out.println();
               System.out.println("SuperShine statistics:\n'Bronze' washes:\t" + b + "\n'Silver' washes:\t" + s + 
               "\n'Gold' washes:\t\t" + g + "\n'Diamond' washes:\t" + d + "\nTotal number of car washes:\t" + counter +
               "\nTotal price of car washes:\t\t" + oms + " Kr.\nRevenue: " + revenue + " Kr.");
            }else{
               
               System.out.println("You have entered a wrong code");
            }
         
      }
      }

   }
   
}