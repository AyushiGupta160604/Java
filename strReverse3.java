public class strReverse3 {
    public static void main(String[] args){
        String str = "Hi! I am Ayushi Gupta";
        String intermediate = "";
        String strArr[] = str.split(" ");
        String rev = "";
        for(int i = strArr.length - 1; i >= 0; i--){
            intermediate = intermediate + strArr[i] + " ";
        }
        for(int i = intermediate.length() - 1; i >= 0; i--){
            rev = rev + intermediate.charAt(i);
        }
        System.out.println("The required version of reversed string is: "+ rev);
}
}
