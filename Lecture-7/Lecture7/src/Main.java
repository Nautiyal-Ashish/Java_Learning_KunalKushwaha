import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
// This is repeating so istead of these we use switch
//        if (fruit.equals("mango")){
//            System.out.println("King of friut");
//        }
//        if (fruit.equals("apple")) {
//            System.out.println("A red apple");
//        }

//        Switch Cases : Old Format
//        switch (fruit){
//            case "mango":
//                System.out.println("King Of fruit");
//                break;
//            case "apple":
//                System.out.println("A red apple");
//                break;
//            case "orange":
//                System.out.println("A orange ");
//                break;
//            case "grapes":
//                System.out.println("Small green fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit : ");
//        }

//        New Format
//        switch (fruit) {
//            case "mango" -> System.out.println("King Of fruit");
//            case "apple" -> System.out.println("A red apple");
//            case "orange" -> System.out.println("A orange ");
//            case "grapes" -> System.out.println("Small green fruit");
//            default -> System.out.println("Please enter a valid fruit : ");
//        }
//Program 2
        int day = in.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thrusday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Please Enter from 1 to 7 ");
//        }

//        Old Format
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Please Enter from 1 to 7 ");
//                break;
//        }
// New Format
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("Weekend");
//            default -> System.out.println("Please Enter from 1 to 7 ");
//        }



    }
}
