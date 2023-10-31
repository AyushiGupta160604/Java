public class Array1_enhancedForLoop {
    public static void main(String[] args){
        int arr1[] = {1, 2, 3, 4};
        double arr2Normal2D[][] = {{1.2, 4.2, 3.2},
                            {2.2, 4.3, 3.3},
                            {3, 4.1, 6}};
        int arr3Jagged[][] = {{1, 3},
                            {2, 4, 3},
                            {1}};   
        
        int arr4[][][] = {
                            {
                                {1, 2, 3},
                                {4, 5, 6}
                            }
                         };
       
        for(int n: arr1){
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println();

        for(double m[]: arr2Normal2D){
            for(double m1: m){
                System.out.print(m1 + "  ");
            }
            System.out.println();
        }
        System.out.println();

        for(int n1[]:  arr3Jagged){
            for(int n2: n1){
                System.out.print(n2 + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for(int k1[][]: arr4){
            for(int k2[]: k1){
                for(int k3: k2){
                    System.out.print(k3 + "  ");
                }
                System.out.println();
            }
        }
    }
}
