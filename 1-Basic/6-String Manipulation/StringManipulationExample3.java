public class StringManipulationExample3{
    public static void main(String[] args){
        String searchQuery = "Java programming";
        String articleTitle = "Learn Java Programming: A Beginner's Guide";
        String articleDescription = "This article provides a comprehensive introduction to Java programming for beginners.";

        String highlightedTitle=articleTitle.replaceAll("(?i)"+searchQuery, "<span style='background-color:yellow'>"+searchQuery+"</span>");
        String highlightedDescription=articleDescription.replaceAll("(?i)"+searchQuery, "<span style='background-color:yellow'>"+searchQuery+"</span>");

        System.out.println(highlightedTitle);
        System.out.println(highlightedDescription);
    }
}