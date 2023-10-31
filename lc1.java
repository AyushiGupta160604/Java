class lc1 {
    public static boolean isPalindrome(int x) {
        int rev = 0;
        while(x != 0){
            rev = rev + x % 10;
            x = x / 10;
        }
        if(rev == x){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        isPalindrome(121);
    }
}

