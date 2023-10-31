// pattern like E
public class pattern6 {
    public static void main(String[] args){

        int n = 6;
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < n + 1; j++){
                if( j == 0 || i == 0 || i == n/2 || i == n){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
