// printing both the diagonals of a 10 X 10 square
public class pattern11 {
    public static void main(String[] args){
        int n = 10;
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < n + 1; j++){
                if(i == j || i + j == n || i ==0 || i == n || j ==0 || j ==n){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
                System.out.println();
        }
    }
}
