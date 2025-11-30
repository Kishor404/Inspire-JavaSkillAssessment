public class Ex3{
    public static boolean isPalindrome(String str){
        String rev="";
        boolean isPalin=false;
        for(int i=str.length()-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        if(rev.equals(str)){
            isPalin=true;
        }
        return isPalin;
    }
    public static void main(String[] args){
        String str="madam";
        boolean isPalin=isPalindrome(str);
        System.out.println("is Palindrome : "+isPalin);
    }
}