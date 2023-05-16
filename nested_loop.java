// Nested loop with a simple example

public class nested_loop {
    public static void main(String[] args){
        int age = 18;
        if (age >= 18 && age <= 60){
            if (age > 20 && age < 30){
                System.out.println("You're in your 20's");
            }
            else if (age >= 30 && age <= 40){
                System.out.println("You're in your 30's");
            }
            else{
                System.out.println("You're neither in you're 20's nor in 30's");
            }
        }
        else if (age > 60){
            System.out.println("You're an old person now...");
        }
        else if (age >= 16 && age < 18){
            System.out.println("You're a teen");
        }
        else{
            System.out.println("You're still a kid");
        }
    }
}
