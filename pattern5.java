//pattern like I
public class pattern5 {
    public static void main(String[] args){

        int n = 4;
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < n + 1; j++){
                if(j == n/2 || i == 0 || i == n){
                    System.out.print(" *");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
