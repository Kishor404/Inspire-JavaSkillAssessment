public class Ex2{
    public static String reverseString(String str){
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args){
        String str="Hello World !";
        String rev=reverseString(str);
        System.out.println("Reversed String : "+rev);
    }
}