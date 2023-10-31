import java.util.Scanner;
public class input_user {
    
    public static void main(String[] args){
        
            try (Scanner objScanner = new Scanner(System.in)) {
                System.out.print("Enter the age = ");
                int age = objScanner.nextInt();

                System.out.print("Enter the average of class marks out of 20 = ");
                double average = objScanner.nextDouble();

                System.out.print("Enter your name = ");
                String name = objScanner.next();

                System.out.println(" The entered age is " + age);
                System.out.println(" The average of class marks is " + average);
                System.out.println("The name entered is " + name);
            }
        }
       
    }
   

    

