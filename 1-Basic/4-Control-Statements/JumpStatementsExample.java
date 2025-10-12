public class JumpStatementsExample{
    public static void main(String[] args) {

        // BREAK AND CONTINUE

        System.out.println("BREAK AND CONTINUE");

        for(int i=1; i<=10; i++){
            if(i==5){
                break;
            }
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
   
    }
}