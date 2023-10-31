// pattern A, B, C, D, E, F, G, H printing 
public class pattern14{
    public static void main(String[] args){
        // A
        int n = 15;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i + j == n/2 || j - i == n/2 || i == n/4 && i + j >= n/2 && j - i <= n/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }//B
        System.out.println();
        for(int i = 0; i < (n+1)/2; i++){
            for(int j = 0; j < (n+1)/2; j++){
                if(j == 0 || i == n/4 && j < (n - 1)/2 || i == 0 && j < n/2  || i == n/2 && j < n/2 || j == n/2 && i > 0 && i< n/4 || j == n/2 && i < n/2 && i > n/4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }// C
        System.out.println();
        for(int i = 0; i < (n+1)/2; i++){
            for(int j = 0; j < (n+1)/2; j++){
                if(i == 0 && j > 0 || i == n/2 && j > 0 || j == 0 && i > 0 && i < n/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }// D
        System.out.println();
        for(int i = 0; i < (n+1)/2; i++){
            for(int j = 0; j < (n+1)/2; j++){
                if(j == 0 || i == 0 && j < n/2 || i == n/2 && j< n/2 || j == n/2 && i > 0 && i < n/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }// E
        System.out.println();
        for(int i = 0; i < (n+1)/2; i++){
            for(int j = 0; j < (n+1)/2; j++){
                if(j == 0 || i == 0 || i == n/4 || i == n/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } // F
        System.out.println();
        for(int i = 0; i < (n+1)/2; i++){
            for(int j = 0; j < (n+1)/2; j++){
                if(j == 0 || i == 0 || i == n/4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }// G
        System.out.println();
        for(int i = 0; i < (n+1)/2; i++){
            for(int j = 0; j < (n+1)/2; j++){
                if(i == 0 && j > 0 || j == 0 && i > 0 && i < n/2 || i == n/2 && j > 0 || j == n/2 && i > n/4 || i == n/4 && j> n/4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }//H
        System.out.println();
        for(int i = 0; i < (n+1)/2; i++){
            for(int j = 0; j < (n+1)/2; j++){
                if(j == 0 || j == n/2 || i == n/4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}