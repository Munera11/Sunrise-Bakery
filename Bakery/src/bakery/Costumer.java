
package bakery;

import java.util.ArrayList;
import java.util.Scanner;


public class Costumer extends User{
    private String address;
    
    ArrayList<Product> shoppingCart;
   public static ArrayList<Product> drinksList;
   public static ArrayList<Product> breadList;
   public static ArrayList<Product> dessertList;
    Product product = new Product();


    public Costumer(String id, String name, int age, String address) {
        super(id, name,age);
        this.address=address;
    }
   
    public Costumer()
    {
    shoppingCart=new ArrayList<>();
    
    drinksList=new ArrayList<>();
    drinksList.add(new Drinks("Medium","12","Latte",17.0,168));
    drinksList.add(new Drinks("Medium","34","Cappuccino",18.0,165));
    drinksList.add(new Drinks("Small","56","Iced Tea",12.0,35));
    drinksList.add(new Drinks("Small","78","Fresh Juice",15.0,110));
    
    breadList=new ArrayList<>();
    breadList.add(new Bread("Brown","Olive&Tomato","21","Focaccia",45.9,250));
    breadList.add(new Bread("White","None","43","Baguette",37.5,130));
    breadList.add(new Bread("White","None","65","Brioche",26.5,240));
    
    dessertList=new ArrayList<>();
    dessertList.add(new Dessert("Fluffy & Buttery rolls topped with icing","13","Cinnamon Roll",9.5,436));
    dessertList.add(new Dessert("Filled with cream and fresh strawberries","46","Straeberry tart",18.8,197));
    dessertList.add(new Dessert("Creamy cheesecake, topped with mixed berries","79","Cheesecake",15.5,321));
    }
   public String getAddress() {
        return address;
    }
   
    public void setAddress(String address) {
        this.address = address;
    }   
    
    
    String userInput;
    Bakery bk = new Bakery();

    @Override
    
    public void menu()
      {
       super.menu();
       Scanner input = new Scanner(System.in);   
       System.out.println("                           ~~~***~~~***~~~***~~~ WELCOME DEAR COSTUMER ~~~***~~~***~~~***~~~");
       int choice;
       do{
       System.out.println("\n ~1~ Add Products \n ~2~ View Cart \n ~3~ Print Bill \n ~4~ Exit");
       System.out.print("Your choice :" );
       choice = input.nextInt();
       switch (choice)
          {
           case 1:
               addProduct();
               break;
           case 2:
               viewCart();
               break;
           case 3:
               printBill();
               break;
           case 4:               
               Bakery.Bakerymenu();
            
               break;
           default:
               System.out.println("Wrong Entry");
          }
       }while(choice!=4);
      }
    public void addProduct()
        {
            Scanner input = new Scanner(System.in);
            System.out.println("~1~ Bread \n ~2~ Desserts \n ~3~ Drinks \n ~4~ Exit");
            int choice = input.nextInt();
            switch(choice)
              {
                case 1:
                    addBread();
                    break;
                case 2:
                    addDessert();
                    break;
                case 3:
                    addDrink();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Wrong Entry");
              }
        }
    public void addDrink()
       {      
       Scanner input = new Scanner(System.in);
       System.out.println("~Choose drink from menu~");
        for (int i = 0; i < drinksList.size(); i++) 
          {
            System.out.println("# "+(i+1)+" "+drinksList.get(i).toString()); 
          }

        System.out.println("Enter the number of drink you want to add: ");
        int choice = input.nextInt();
        
       
            
                if(choice<=drinksList.size()) {
        shoppingCart.add(drinksList.get(choice-1));
        
         System.out.println("Product Added Successfully");  
                  
                } else
                    System.out.println("You are back to the menu for picking wrong number");
               addProduct();
        
        }
           
        
        
       

    public void addBread()
        {
        System.out.println("~Choose bread from menu~");
        for (int i = 0; i < breadList.size(); i++) 
          {
            System.out.println("# "+(i+1)+" "+breadList.get(i).toString()); 
          }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of bread you want to add");
        int choice = input.nextInt();
        
                if(choice<=breadList.size())
        { shoppingCart.add(breadList.get(choice-1));
         System.out.println("Product Added Successfully");  
        }
                else
           System.out.println("You are back to the menu for picking wrong number");
               addProduct();
        }
    
    public void addDessert()
        {
        System.out.println("~Choose dessert from menu~");
        for (int i = 0; i < dessertList.size(); i++) 
          {
            System.out.println("# "+(i+1)+" "+dessertList.get(i).toString()); 
          }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of dessert you want to add");
        int choice = input.nextInt();
                if(choice<=dessertList.size())
        { shoppingCart.add(dessertList.get(choice-1));
         System.out.println("Product Added Successfully");  
        }
                else
           System.out.println("You are back to the menu for picking wrong number");
               addProduct();
        }
        
    
    public void viewCart() 
       {      
        Scanner input = new Scanner(System.in);

        System.out.println("Your cart:");  
        for (int i = 0; i < shoppingCart.size(); i++) 
        {
            System.out.println((i+1)+" "+shoppingCart.get(i).toString());   
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
           System.out.println(" Enter Y to remove item from your cart Enter item's id , N to Go back");
           userInput = input.next(); 
           if (userInput.equalsIgnoreCase("Y")){

deletefromCart();

}
             if (userInput.equalsIgnoreCase("N"))
            {
                    menu();

            }
       
       }

       
    public void printBill() 
       {
          double total=0;
     for (int i = 0; i < shoppingCart.size(); i++) {
         total+=shoppingCart.get(i).getProductPrice();
     }
       System.out.println("The Total Bill is "+total);
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
       }
    
    
    
    public void deletefromCart(){
         Scanner input = new Scanner(System.in);  

        System.out.println("Enter id of item you want to delete from your cart");
        String id = input.next();

             for (int i = 0; i < shoppingCart.size(); i++) {

              if(shoppingCart.get(i).getProductId().equals(id))
              {

                            shoppingCart.remove(i);

              }
        
             }
             System.out.println("Item removed successfully");
       
    }
    
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return super.toString() + "\n Address: " + address ;
        
    
    }

 
}
