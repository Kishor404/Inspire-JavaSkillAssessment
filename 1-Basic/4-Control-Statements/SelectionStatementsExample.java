public class SelectionStatementsExample{
    public static void main(String[] args) {

        // IF-ELSE

        System.out.println("IF ELSE");

        int num=9;
        if(num % 2 == 0){
            System.out.println(num+" is Even Number.");
        }else{
            System.out.println(num+" is Odd Number.");
        }

        // SWITCH

        System.out.println("SWITCH");

        int dayOfWeek=3;
        switch(dayOfWeek){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Invalid");
        }   
        // switch(dayOfWeek){
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     default:
        //         System.out.println("Invalid");
        // } 

    }
}