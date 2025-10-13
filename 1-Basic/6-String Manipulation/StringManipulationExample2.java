public class StringManipulationExample2{
    public static void main(String[] args) {
        String str1="Hello";
        String str2="World";

        // LENGTH()

        int len=str1.length();
        System.out.println(len);

        // CHARAT()

        char secondChar = str1.charAt(1);
        System.out.println(secondChar);

        // CONCAT()

        String str3=str1.concat(str2);
        System.out.println(str3);

        // EQUALS()

        boolean isEqual = str1.equals(str2);
        System.out.println(isEqual);

        // EQUALS IGNORE CASE

        boolean isEqualIgnoreCase = str1.equalsIgnoreCase("hello");
        System.out.println(isEqualIgnoreCase);

        // INDEX OF

        int index=str1.indexOf('l');
        System.out.println(index);

        // LAST INDEX OF

        int lastIndex = str1.lastIndexOf('l');
        System.out.println(lastIndex);

        // SUBSTRING

        String sub = str1.substring(2);
        System.out.println(sub);

        // SUBSTRING WITH START AND END

        String sub2 = str1.substring(2,4);
        System.out.println(sub2);

        // TO LOWERCASE

        String low=str1.toLowerCase();
        System.out.println(low);

        // TO UPPERCASE

        String up=str1.toUpperCase();
        System.out.println(up);

        // TRIM

        String str4 ="  java ";
        String trimed=str4.trim();
        System.out.println(trimed);

        // REPLACE

        String str5 = str1.replace('l','r');
        System.out.println(str5);

        String str6 = "Hello World Hello";
        String str7 = str6.replace("Hello", "Java");
        System.out.println(str7);

        // REPLACE ALL

        String str8="123abc456abc";
        String str9=str8.replaceAll("\\d", "#");
        System.out.println(str9);
        String str10=str8.replaceAll("abc", "def");
        System.out.println(str10);

    }
}