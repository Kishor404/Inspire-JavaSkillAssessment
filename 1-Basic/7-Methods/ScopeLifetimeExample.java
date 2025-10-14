public class ScopeLifetimeExample {
   public static void main(String[] args) {
      int x = 10;
      
      if (x > 5) {
         int y = 20; 
         System.out.println("x is greater than 5 and y = "+y); 
      }  // if statement ends
      
      System.out.println("x = " + x);
      // System.out.println("y = " + y); // this line will result in a compile-time error as y is not in scope outside the if statement
   }
}