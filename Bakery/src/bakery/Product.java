
package bakery;

import static bakery.Costumer.breadList;
import static bakery.Costumer.dessertList;
import static bakery.Costumer.drinksList;
import java.util.Scanner;

public class Product {
private String productId;
private String productName;
private double productPrice;
private double calories;
Product(){}
Product(String productId,String productName,double productPrice, double calories)
{
    this.productId=productId;
    this.productName=productName;
    this.productPrice=productPrice;
    this.calories=calories; 
}

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public double getCalories() {
        return calories;
    }
    @Override
    public String toString() {
        return  "\n Product ID: "+productId +"\n Product Name: "+productName +"\n Product Price: "+productPrice +"\n Calories: "+calories;
    } 
    String userInput; 
  
     public void deleteDProduct() {
     Admin admin = new Admin();

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter product number to perform deletion");
    String Pid=scan.next();
     int currentLength = drinksList.size();

   for (int counter = 0; counter < drinksList.size(); counter++) { 		      

             if (drinksList.get(counter).getProductId().equals(Pid)){

                drinksList.remove(counter);
           
                 System.out.println("[ DELETED SUCCESSFULY ]");
                 System.out.println("    [LIST UPDATED]     ");
           
                 displayDrinkProduct();
           
               break;
           }
             
             if (counter == currentLength - 1) {
                 System.out.println("-----------------------------------------");
           System.out.println("The requested Drink is not available in our list.");
               
           
           System.out.println("-----------------------------------------");     
              System.out.print("To Enter product number again Enter, (Y/N) ? ");
            userInput = scan.next();
            if (userInput.equalsIgnoreCase("Y"))
                    
                        deleteDProduct();

            else if (userInput.equalsIgnoreCase("N"))
            {
                    admin.menu();

                    break;
            }
            else{
                            System.out.print("Try Again With (Y/N) only !");   
            }
                   }
      
       }       
    }
            public void displayDrinkProduct() {
      
                   for (int counter = 0; counter < drinksList.size(); counter++) { 	
               
                       System.out.println("-------------------------");
                       System.out.println(drinksList.get(counter));
                       System.out.println("-------------------------");
             

            }
        
            }
            

    public void deleteDtProduct(){
       Admin admin = new Admin();

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter product number to perform deletion");
    String Pid=scan.next();
     int currentLength = dessertList.size();

   for (int counter = 0; counter < dessertList.size(); counter++) { 		      

             if (dessertList.get(counter).getProductId().equals(Pid)){

                dessertList.remove(counter);
           
                 System.out.println("[ DELETED SUCCESSFULY ]");
                 System.out.println("    [LIST UPDATED]     ");
           
                 displayDessertProduct();
           
               break;
           }
             
             if (counter == currentLength - 1) {
                 System.out.println("-----------------------------------------");
           System.out.println("The requested Dessert is not available in our list.");
                  System.out.println("-----------------------------------------");     
                  
                                    
                  System.out.print("To Enter product number again Enter, (Y/N) ? ");
            userInput = scan.next();
            if (userInput.equalsIgnoreCase("Y"))

                   deleteDtProduct();

            else if (userInput.equalsIgnoreCase("N"))
            {
                    admin.menu();

                    break;
            }
            else{
                            System.out.print("Try Again With (Y/N) only !");   
            }
                   
                   }
      
   }      
}
    
    public void displayDessertProduct() {
                
                   for (int counter = 0; counter < dessertList.size(); counter++) { 	
                       
                       
                       
                       System.out.println("-------------------------");
                       System.out.println(dessertList.get(counter));
                       System.out.println("-------------------------");
     
            }
    }
    public void deleteBrProduct(){
    Admin admin = new Admin();

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter product number to perform deletion");
    String Pid=scan.next();
     int currentLength = breadList.size();

   for (int counter = 0; counter < breadList.size(); counter++) { 		      

             if (breadList.get(counter).getProductId().equals(Pid)){

                breadList.remove(counter);
           
                 System.out.println("[ DELETED SUCCESSFULY ]");
                 System.out.println("    [LIST UPDATED]     ");
           
                 displayBreadProduct();
           
               break;
           }
             if (counter == currentLength - 1) {
                 System.out.println("-----------------------------------------");
           System.out.println("The requested Bread is not available in our list.");
                  System.out.println("-----------------------------------------");     
                  
                  
                    System.out.println("-----------------------------------------");     
              System.out.print("To Enter product number again Enter, (Y/N) ? ");
            userInput = scan.next();
            if (userInput.equalsIgnoreCase("Y"))
                    
                   deleteBrProduct();

            else if (userInput.equalsIgnoreCase("N"))
            {
                    admin.menu();

                    break;
            }
            else{
                            System.out.print("Try Again With (Y/N) only !");   
            }
                   
                   }
      
   }
    }
    public void displayBreadProduct() {
                
                   for (int counter = 0; counter < breadList.size(); counter++) { 	
                       
                       
                       
                       System.out.println("-------------------------");
                       System.out.println(breadList.get(counter));
                       System.out.println("-------------------------");
                   }
}
}