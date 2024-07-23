
package bakery;

import static bakery.Costumer.dessertList;
import java.util.Scanner;

public class Dessert extends Product {
    private String specialNote; 
  
  public Dessert(){}
  
  public Dessert(String specialNote,String productId, String productName, double productPrice,double calories){
  
  super(productId, productName, productPrice, calories);

    this.specialNote=specialNote;
  }
  
  public void setSpecialNote(String specialNote ){  
  this.specialNote=specialNote;
  }
   
  public String getSpecialNote(){
  return specialNote; 
  }
  
        @Override
        public String toString(){
           return super.toString()+"\n Describtion : "+specialNote;
        }

          public static Product searchDessert()
       {       
         int x;
         boolean found = false;
         Scanner input= new Scanner(System.in);
         System.out.println("~ Enter Dessert ID ~");
         String id=input.next();
       
        for(x=0;x<dessertList.size();x++)
        {
            if(id.equalsIgnoreCase(dessertList.get(x).getProductId()))
            {
                    dessertList.get(x).toString();
                    found = true;
                    return dessertList.get(x);
            }
        }
        System.out.println("--- UPDATED SUCCESSFULY --- ");
        if(!found)
        {
            System.out.println("That requested Drink is not available in our list! ");
           
        }
        return null;
  
  }
}
