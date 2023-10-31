public class strReverse2 {
    public static void main(String[] args){
        String str = "Hi! I am Ayushi Gupta";
        String rev2 = "";
        String []str_considerate = str.split(" ");
        for(int i = str_considerate.length - 1; i >= 0; i--){
            rev2 = rev2 + str_considerate[i] + " ";
        }
        System.out.println("The required reversed string is: " + rev2);
    }
}
