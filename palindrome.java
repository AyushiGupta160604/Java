// check if the string is palindrome or not (* ignore casing)
public class palindrome {
    public static void main(String[] args){
        String str = "Nitin";
        String rev = "";
        str = str.toLowerCase();
        for(int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("is Palindrome");
        }
        else{
            System.out.println("not a Palindrome");
        }
    }
}
