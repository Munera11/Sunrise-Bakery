
package bakery;


import static bakery.Costumer.drinksList;
import java.util.Scanner;

public class Drinks extends Product {
    private String cupSize; 
    
    public Drinks(){
        
    }

    public Drinks(String cupSize, String productId, String productName, double productPrice, double calories) {
        super(productId, productName, productPrice, calories);
        this.cupSize = cupSize;
        
    }
        
        public String getCupSize(){
            return cupSize;
        }
        
        public void setCupSize(String cupSize){
            this.cupSize=cupSize;
        }
       
        @Override
        public String toString(){
           return super.toString()+"\n CupSize : "+cupSize;
        }

         public static Product searchDrinks()
        {       
        int x;
        boolean found = false;
          Scanner input= new Scanner(System.in);
         System.out.println("~ Enter Drink ID ~");
         String ID=input.next();
       
        for(x=0;x<drinksList.size();x++)
        {
            if(ID.equalsIgnoreCase(drinksList.get(x).getProductId()))
            {
                    drinksList.get(x).toString();
                    found = true;
                    return drinksList.get(x);
            }
        }
        System.out.println("--- UPDATED SUCCESSFULY ---"); 
        if(!found)
        {
            System.out.println("That requested Drink is not available in our list.");
           
        }
        return null;
  
  }
}