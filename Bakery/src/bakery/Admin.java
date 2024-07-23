package bakery;

import static bakery.Costumer.breadList;
import static bakery.Costumer.dessertList;
import static bakery.Costumer.drinksList;
import java.util.Scanner;

public class Admin extends User{
    private String branch;
    private int numOfEmployees;
    Product product = new Product();
    
    public Admin() {
        
    }

    public Admin(String branch, int numOfEmployees, String id, String name,int age)
    {
        super(id, name, age);
        this.branch = branch;
        this.numOfEmployees = numOfEmployees;
        
    }
    

    public String getBranch() {
        return branch;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    @Override
   public void menu()
   {
           Scanner input= new Scanner(System.in);
         System.out.println("***~*~~*~~~~~~~ Welcome To Admin Page ~~~~~~*~~*~*** \n");
         int choice;
        do {
        
    System.out.println("\n >>>Please Enter your choice From The Following Options>>>\n"
            + " \n 1~ To Display items"
            + " \n 2~ To Add items"
            + " \n 3~ To Remove items"
            + " \n 4~ To Update items"
            + " \n 5~ To Exit "
            );
    System.out.print("Enter your choice :" );
            
       choice=input.nextInt();
       switch(choice) {  

        case 1:
          display();
         break;
        case 2:
           add();
         break;
        case 3:
           delete();
         break;
        case 4:
           update();
         break;
        case 5:
        
           System.out.println("**~ Thank you ~** ");
           break;
        default: 
    System.out.println("Invalid choice! Please try again.. ");       
          }
        } while(choice!=5);
    }
       
   public void display()
   {
        
          Scanner input= new Scanner(System.in);
         
         System.out.println(">> Enter your choice \n"
                 + "Enter 1 To Display Drinks\n"
                 + "Enter 2 To Display Dessert\n "
                 + "Enter 3 To Display Bread \n"
              );
         
         int choice=0;
        choice=input.nextInt();
        switch (choice) {
            case 1:
                displayDrink();
                break;
            case 2:
                displayDessert();
                break;
            case 3:
                displayBread();
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
     public void displayDrink()
     {
          System.out.println("^ Drinks List ^");  
    for (int i = 0; i <drinksList.size(); i++) {
        System.out.println((i+1)+" "+drinksList.get(i).toString()); 
    }
       System.out.println("---------------------------------"); 
     }
      public void displayDessert()
     {
          System.out.println("^ Dessert List ^");  
    for (int i = 0; i < dessertList.size(); i++) {
        System.out.println((i+1)+" "+dessertList.get(i).toString()); 
    }
       System.out.println("---------------------------------"); 
     }
     public void displayBread()
     {
          System.out.println("^ Bread List ^");  
    for (int i = 0; i < breadList.size(); i++) {
        System.out.println((i+1)+" "+breadList.get(i).toString()); 
    }
       System.out.println("---------------------------------"); 
     }
     
     public void add()
    {
          Scanner input= new Scanner(System.in);
          System.out.println("- - - - - - - -");
         System.out.println("Enter Product Id");
         String id=input.next();
         System.out.println("Enter Product Name");
         String name=input.nextLine();
         name+=input.nextLine();
         System.out.println("Enter Product Price");
         double price=input.nextDouble();
         System.out.println("Enter Product Calories");
         double calories=input.nextDouble();
         System.out.println("- - - - - - - -");
      
    
       System.out.println(">> Enter your choice \n"
                 + "Enter 1 To Add Drinks\n"
                 + "Enter 2 To Add Dessert\n"
                 + "Enter 3 To Add Bread \n"
                 + ""
                 + "Enter option : "
              );
        
        int choice=input.nextInt();
        switch (choice) {
            case 1:
                addDrink(id,name,price,calories);
                break;
            case 2:
                addDessert(id,name,price,calories);
                break;
            case 3:
                addBread(id,name,price,calories);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
      public void addDrink(String id,String name,double price,double calories )
    {
         Scanner input= new Scanner(System.in);
         System.out.println("Enter Cup Size That You Want ^-^ ");
         String cupSize=input.next();
        drinksList.add(new Drinks(cupSize,id,name,price,calories));
        
        System.out.println("Drink Added Successfully");
            System.out.println("-------------------------------");
                  
    }
      public void addDessert(String id,String name,double price,double calories )
    {
         Scanner input= new Scanner(System.in);
         System.out.println("Write a Special Note ^-^ ");
         String specialNote=input.nextLine();
         
        dessertList.add(new Dessert(specialNote,id,name,price,calories));
        System.out.println("Dessert Added Successfully");
            System.out.println("----------------------------");
                
    }
       public void addBread(String id,String name,double price,double calories )
    {
         Scanner input= new Scanner(System.in);
         System.out.println("Enter white bread Or Brown bread ^-^ ");
         String whiteOrBrown =input.next();
         System.out.println("Enter The Fillings you want ^-^ ");
         String fillings =input.next();
         breadList.add(new Bread(whiteOrBrown,fillings,id,name,price,calories));
         System.out.println("Bread Added Successfully");
            System.out.println("----------------------------");
           
    }
     
     public void delete()
     {
       
          Scanner input= new Scanner(System.in);
    
       System.out.print(">> Enter your choice \n"
                 + "Enter 1 To Delete From Drinks\n"
                 + "Enter 2 To Delete From Dessert\n"
                 + "Enter 3 To Delete From Bread \n"
               + "----------------------------\n"
               + ""
               + "Enter Option : "
              );
         int choice=0;
         
        choice=input.nextInt();
        switch (choice) {
            case 1:
                deleteDrink();
                break;
            case 2:
                deleteDessert();
                break;
            case 3:
                deleteBread();
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
         
     }
        public void deleteDrink()
    {
       
      product.deleteDProduct();
       
         
    }
      public void deleteDessert()
    {
        product.deleteDtProduct();
    }
       public void deleteBread()
    {
        product.deleteBrProduct();
    }
     
     
     public void update()
     {
         Scanner input= new Scanner(System.in);
         System.out.println(">> Enter your choice \n"
                 + "Enter 1 To Update Drinks\n"
                 + "Enter 2 To Update Dessert\n "
                 + "Enter 3 To Update Bread \n"
              );
         int choice=0;
        choice=input.nextInt();
        switch (choice) {
            case 1:
                updateDrinks();
                break;
            case 2:
                updateDessert();
                break;
            case 3:
                updateBread();
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
     }
     public void updateDrinks()
    {
          Scanner input= new Scanner(System.in);
         Drinks drink=(Drinks) Drinks.searchDrinks();
        if(drink!=null)
        {
         System.out.println("~~Enter new data for this drink~~ ");
         
            System.out.println("--------------------");
            
          System.out.println("Enter new ID");
          String id=input.next();
          drink.setProductId(id);
          
          System.out.println("Enter new Name");
          String name=input.next();
          drink.setProductName(name);
          
          System.out.println("Enter new Price");
          Double price=input.nextDouble();
          drink.setProductPrice(price);
          
          System.out.println("Enter new Calories");
          Double cal = input.nextDouble();
          drink.setCalories(cal);
          
          System.out.println("Enter new Cup Size");
          String cup = input.next();
          drink.setCupSize(cup);
         }
    }
      public void updateDessert()
    {
          Scanner input= new Scanner(System.in);
         Dessert dessert=(Dessert) Dessert.searchDessert();
        if(dessert!=null)
        { 
        System.out.println("~~Enter new data for this dessert~~ ");
        
        System.out.println("Enter new ID");
          String id=input.next();
          dessert.setProductId(id);
          
          System.out.println("Enter new Name");
          String name=input.next();
          dessert.setProductName(name);
          
          System.out.println("Enter new Price");
          Double price=input.nextDouble();
          dessert.setProductPrice(price);
          
          System.out.println("Enter new Calories");
          Double cal = input.nextDouble();
          dessert.setCalories(cal);
          
          System.out.println("Enter new Special Note");
          String specialNote=input.next();
          dessert.setSpecialNote(specialNote);
        }
    }
      public void updateBread()
    {
         Scanner input= new Scanner(System.in);
         Bread bread=(Bread) Bread.searchBread();
        if(bread!=null)
        {
         System.out.println("~~Enter new data for this Bread ~~ ");
         
           System.out.println("Enter new ID");
          String id=input.next();
          bread.setProductId(id);
          
          System.out.println("Enter new Name");
          String name=input.next();
          bread.setProductName(name);
          
          System.out.println("Enter new Price");
          Double price=input.nextDouble();
          bread.setProductPrice(price);
          
          System.out.println("Enter new Calories");
          Double cal = input.nextDouble();
          bread.setCalories(cal);
          
          System.out.println("Enter new  Fillings");
          String fillings=input.next();
          bread.setFillings(fillings);
         
         
         }
        
        }
   

    @Override
    public String toString() {
        String result="";
        result+= "Drinks List ";
        result+="\n----------------------------";
        for (int i = 0; i < drinksList.size(); i++) {
             result+="\n";
           result+=(i+1)+" "+drinksList.get(i).toString(); 
        }
          result+= "\n Dessert List ";
        result+="\n----------------------------";
        for (int i = 0; i < dessertList.size(); i++) {
            result+="\n";
           result+=(i+1)+" "+dessertList.get(i).toString(); 
        }
          result+= "\n Bread List ";
        result+="\n----------------------------";
        for (int i = 0; i < breadList.size(); i++) {
            result+="\n";
           result+=(i+1)+" "+breadList.get(i).toString(); 
        }
        return result;
      
}

}



