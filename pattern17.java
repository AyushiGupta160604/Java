// Printing PW SKILLS pattern
public class pattern17 {
    public static void main(String[] args){
        int n = 6;
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < n + 1; j++){
                if(j == 0 || i == 0 && j < n || i == n/2 && j < n || j == n && i > 0 && i < n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(int j = 0; j < n + 1  ; j++){
                if(j == 0 || j == n || i > n/2 && i + j == n || i > n/2 && i - j == 0 || i == n/2 && j == n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("     ");
            for(int j = 0; j < n + 1  ; j++){
                if(i == 0 && j > 0 ||  j == 0 && i > 0 && i < n/2 || i == n/2 && j > 0 && j < n || j == n && i > n/2  && i < n || i == n && j < n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(int j = 0; j < n + 1  ; j++){
                if( j == 0 || i - j == n/2 || i + j == n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(int j = 0; j < n + 1  ; j++){
                if( i == 0 || i == n ||  j == n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(int j = 0; j < n + 1  ; j++){
                if( j == 0 || i == n ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(int j = 0; j < n + 1  ; j++){
                if( j == 0 || i == n ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(int j = 0; j < n + 1  ; j++){
                if(i == 0 && j > 0 ||  j == 0 && i > 0 && i < n/2 || i == n/2 && j > 0 && j < n || j == n && i > n/2  && i < n || i == n && j < n){
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
