public class starP {
    public static void main(String[] args) {
        //ADDING A STAR IN NEXT ROW
        //OUTPUT: 
        // *
        // **
        // ***
        // **** 

        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
