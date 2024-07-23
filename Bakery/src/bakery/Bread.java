
package bakery;

import static bakery.Costumer.breadList;
import java.util.Scanner;

public class Bread extends Product{
    private String whiteOrBrown;
    private String fillings;
    
    public Bread (){}
    
    public Bread (String whiteOrBrown,String fillings, String productId, String productName, double productPrice,double calories){
      super(productId, productName, productPrice,calories);

        this.whiteOrBrown=whiteOrBrown;
        this.fillings=fillings;
    
    }
    
    public void setWhiteOrBrown(String whiteOrBrown){
    this.whiteOrBrown=whiteOrBrown;
    }
    public void setFillings(String fillings){
    this.fillings=fillings;
    }
    
    public String getWhiteOrBrown(){
    return whiteOrBrown;
    }

    public String getFillings(){
    return fillings;
    }
       
        @Override
        public String toString(){
           return super.toString()+"\n WhiteOrBrown: "+whiteOrBrown+"\n Fillings: "+fillings;
        }

       public static Product searchBread()
    {       
      
        int x;
        boolean found = false;
          Scanner input= new Scanner(System.in);
         System.out.println("~ Enter Bread ID ~");
         String id=input.next();
       
        for(x=0;x< breadList.size();x++)
        {
            if(id.equalsIgnoreCase(breadList.get(x).getProductId()))
            {
                    breadList.get(x).toString();
                    found = true;
                    return breadList.get(x);
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
