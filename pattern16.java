//Pattern printing
public class pattern16 {
    public static void main(String[] args){
        int n = 14;
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < n + 1; j++){
                if(i == 0 || j == 0 || j == n || i == n || i + j <= n/2 || j - i >= n/2){
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
