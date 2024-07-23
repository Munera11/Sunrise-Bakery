 
package bakery;


import static java.lang.System.exit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bakery {


    

    
    public static void main(String[] args) {
        
        
        
   Bakerymenu();
   
   
   
    }
    
    public static void Bakerymenu() {
    
    
     String Username ="munera";
    String Password= "111";
    User a  = new Admin();
    User c = new Costumer();
    
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy");
        String dateStr = sdf.format(new Date());
        System.out.print(dateStr.toUpperCase());
        System.out.println("           ~~~***~~~***~~~***~~~ WELCOME TO SUNRISE BAKERY ~~~***~~~***~~~***~~~");
        System.out.println("                                              ~~~ HAPPINESS STARTS HERE ~~~");
        int choice1;
        String menu1 = " \n ~1~ Admin \n ~2~ Costumer \n ~3~ Exit \n"
                + ""
                + "Enter option : ";
        do{
                   Scanner input = new Scanner(System.in);   

               System.out.println(menu1);
               choice1=input.nextInt();
               
               switch(choice1)
               {
                   case 1:
                        System.out.println("Enter Username: ");
                 String username1=input.next();
                       System.out.println("Enter Password: ");
                 String password1=input.next();
  
           
        if (username1.equals(Username) && password1.equals(Password)) {
        System.out.println("                    Access Granted!");
        a.menu();
       }

    else if (username1.equals(Username)) {
        System.out.println("Invalid Password!");
    } else if (password1.equals(Password)) {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }

                       break;
                   case 2:
                       c.menu();
                       break;
                   case 3:
                       exit(0);
                       break;
                   default:
                       System.out.println("Wrong Entry");
                       break;
               }
          }while (choice1!=3);
        
    
    
    
    
    
    
    
}
    
}
