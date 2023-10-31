public class Array1 {
    public static void main(String[] args){
       int arrayNumber[][] = {{1,2,3,4},{5,6,7,8},{9,1,3,6}};

    for(int i = 0; i <= 2; i++){
        for(int j = 0; j <= 3; j++){
            System.out.print(arrayNumber[i][j] + "  ");
        }
        System.out.println("  ");
    }         
    }
}
