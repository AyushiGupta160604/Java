// pattern like D
public class pattern9 {
    public static void main(String[] args){
        int n = 6;
        for(int i =0; i < n + 1; i++){
            for(int j = 0; j < n + 1; j++){
                if(j == 0 || j == n && i > 1 && i < n - 1 || i == 0 && j < n - 1 || i == n && j < n - 1){
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
