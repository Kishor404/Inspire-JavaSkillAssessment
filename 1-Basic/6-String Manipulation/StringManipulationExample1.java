public class StringManipulationExample1{
    public static void main(String[] args) {
        String str1="Hello";
        String str2="World";

        // CONCATE

        String str3=str1+str2;
        System.out.println(str3);

        // CONCATE WITH METHOD

        String str4=str1.concat(str2);
        System.out.println(str4);

        // CHANGE TO UPPER CASE

        String str5=str1.toUpperCase();
        System.out.println(str5);

        // CHANGE TO LOWER CASE

        String str6=str1.toLowerCase();
        System.out.println(str6);

    }
}