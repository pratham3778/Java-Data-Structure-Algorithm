// Encapsulation is a process of wrapping data(attributes) and methods that operate on that data into a single unit(class) while restricting direct access to object components.
// Eg : Imagine a safebox where valuables(attributes) are stored, which can only be accessed uisng a key(method) and not directly.

public class Encapsulation {
    // Private attribute (Encapsulated)
    private String combinationCode = "1234";

    // Method to open the safe
    public String openSafe(String enteredCode) {
        if(enteredCode.equals(combinationCode)) {
            return "Safe Opened Successfully";
        } else{
            return "Incorrect Code !";
        }
    }

    // Method to change the combination code
    public String changeCode(String oldCode, String newCode) {
        if(oldCode.equals(combinationCode)) {
            combinationCode = newCode;
            return "Code Changed";
        } else {
            return "Incorrect current code";
        }
    }
    public static void main(String[] args) {
        Encapsulation safeBox = new Encapsulation();

        System.out.println(safeBox.openSafe("1000"));
        System.out.println(safeBox.openSafe("1234"));

        System.out.println(safeBox.changeCode("0000", "1111"));
        System.out.println(safeBox.changeCode("1234", "1111"));

        System.out.println(safeBox.openSafe("1111"));
        
    }
}