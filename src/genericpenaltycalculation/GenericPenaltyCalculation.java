
package genericpenaltycalculation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class GenericPenaltyCalculation {

   
    public static void main(String[] args) {
       ArrayList<String> arrayBook = new ArrayList<String>();
       ArrayList<String> arrayDate = new ArrayList<String>();
            Scanner input = new Scanner(System.in);
            System.out.println("********Welcome to Generic Penalty Calculation********");
            
            String islemler = "1 - Add New Book\n"
                    + "2 - Deliver a Book\n"
                    + "3 - Show Books\n"
                    + "4 - Exit";
            System.out.println(islemler);
            System.out.println("*****************************************");
            
            while(true){
                System.out.println("Please choose the option : \n");
                String islem = input.nextLine();
                if (islem.equals("1")) {
                    System.out.println("Add Book Name : ");
                    String bookName = input.nextLine();
                   
                   /* Date simdikiZaman = new Date();
                    String bookRentDate = simdikiZaman.toString();*/
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Calendar c = Calendar.getInstance();
                    c.setTime(new Date()); 
                    c.add(Calendar.DATE, 10); 
                    String bookRentDate = sdf.format(c.getTime());
                    System.out.println("Rent Date added : " + bookRentDate); 
                    
                    
              
                    arrayBook.add(bookName);
                    arrayDate.add(bookRentDate);
                    System.out.println("Book added!");
                }else if(islem.equals("3")){
                    for (int i = 0; i < arrayBook.size(); i++) {
                        System.out.println((i + 1)+ "." + "Book is : " + arrayBook.get(i) + "\n" + "Rent Date is : " + arrayDate.get(i));
                    }
                
                }else if(islem.equals("4")){
                    System.out.println("Exit Program");
                    break;
                }
            }
    }
    
}
