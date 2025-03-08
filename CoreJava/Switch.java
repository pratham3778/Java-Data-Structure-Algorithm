package CoreJava;


//switch case statement we use String, int, enum, byte , short, char
//switch case statement we cannot use Long


    /*
    USING enum
    */
      enum Day{
        Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday
      }
public class Switch {
    /*
    USING int
    public static void main(String[] args) {
        int num = 2;

        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Not Found");
        }
    }*/


    /*
    USING String
    public static void main(String[] args) {
        String day = "Monday";

        switch (day) {
            case "Monday":
                System.out.println("week day 1");
                break;
             case "Tuesday":
                System.out.println("week day 2");
                break;
             case "Wednesday":
                System.out.println("week day 3");
                break;
             case "Thrusday":
                System.out.println("week day 4");
                break;
             case "Friday":
                System.out.println("week day 5");
                break;             
            default:
            System.out.println("Weekend");
                break;
        }
    }*/

    /*
     USING Long we cannot
     */

     /*
    USING enum
      */
    public static void main(String[] args) {
        Day today = Day.Sunday;

        switch (today) {
            case Monday:
                System.out.println("week day 1");
                break;
             case Tuesday:
                System.out.println("week day 2");
                break;
             case Wednesday:
                System.out.println("week day 3");
                break;
             case Thrusday:
                System.out.println("week day 4");
                break;
             case Friday:
                System.out.println("week day 5");
                break;             
            default:
            System.out.println("Weekend");
                break;
        }
    }

}
