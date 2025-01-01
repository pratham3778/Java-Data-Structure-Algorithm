public class halfCharacterPyrd {
    public static void main(String[] args) {
      //OUTPUT :
      // A
      // BC
      // DEF
      // GHIJ
      
        char ch = 'A';

        for(int line = 1; line <= 4; line++) {
            for(int row = 1;row <= line; row++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
