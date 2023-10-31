// better method of strReverse3 
public class strReverse4 {
    public static void main(String[] args){
        String str = "Hi! I am Ayushi Gupta";
        String rev = "";
        for(String sub: str.split(" ")){
            for(int  i = sub.length() - 1; i >= 0; i--){
                rev = rev + sub.charAt(i);
            }
            rev = rev + " ";
        }
        System.out.println("Required reversed string is: "+ rev);
    }
}
