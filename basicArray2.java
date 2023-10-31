public class basicArray2{
    public static void main(String []args){
        int nums[] = new int[10]; 
        for(int i = 0; i <= 9; i++){
            nums[i] = 3 * (i + 1);
            System.out.println(nums[i]);
        }
    }
}