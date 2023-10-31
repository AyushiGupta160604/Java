// Pattern like H
public class pattern4 {
    public static void main(String[] args){

        int n = 6;
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < n + 1; j++){
                if(j == 0 || j == n || i == n/2){
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
