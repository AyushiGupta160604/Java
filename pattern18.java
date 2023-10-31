// Printing Ayushi pattern
public class pattern18 {
    public static void main(String[] args){
        int n = 8;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i + j == n/2 || j - i == n/2 || i == n/4 && i + j >= n/2 && j - i <= n/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j = 0; j < (n + 1)/2  ; j++){
                if(i + j == (n+1)/2 || i - j == 0 && i < n/4){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(int j = 0; j < n/2 + 1  ; j++){
                if( j == 0 && i < n/2 || i == n/2 && j > 0 && j < n/2 || j == n/2 && i < n/2 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(int j = 0; j < n/2 + 1  ; j++){
                if( i == 0 && j > 0 && j < n/2|| i == n/4 && j > 0 && j < n/2 || j == 0 && i < n/4 && i > 0 || j == n/2 && i > n/4 && i < n/2 || i == n/2 && j < n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(int j = 0; j < n/2 + 1  ; j++){
                if( j == 0 && i <= n/2 || j == n/2 && i <= n/2 || i == n/4 && j < n/2 + 1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(int j = 0; j < n/2 + 1  ; j++){
                if( i == 0 && j <= n/2  || i == n/2 && j <= n/2 || j == n/4 && i <= n/2 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
    }
  }
}

