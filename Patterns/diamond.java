public class diamond {
// OUTPUT :
//   *
//  ***
// *****
//  ***
//   *
    public static void main(String[] args) {
      int n = 5;
        int trows = n;
        int spaces = n/2;
        int stars = 1;
        
        //first half
        for(int row = 1; row <= trows; row++) {
            //space
            for(int space = 1; space <= spaces ;space++) {
                System.out.print(" ");
            }
            //star
            for(int star = 1; star <= stars; star++) {
                System.out.print("*");
            }
            System.out.println();
            if (row <= trows/2) {
                spaces--;
                stars+=2;
            } else {
                spaces++;
                stars-=2;

            }
        }
    }
}
