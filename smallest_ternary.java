// checking for the smallest number using ternary operator

public class smallest_ternary {
    public static void main(String[] args){
        int a = 30;
        int b = 20;
        int c = 40;
        int smallest = (a < b) ? ((a < c) ? a : b) : ((b < c) ? b : c);
        System.out.println(smallest);
    }
}

    

