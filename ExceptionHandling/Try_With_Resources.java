package ExceptionHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Try_With_Resources {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("/Users/prathamtanpure/cognizant/ExceptionHandling/ind.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException ex) {
            System.out.println("Error in reading file: " + ex);
        }
    }
}
