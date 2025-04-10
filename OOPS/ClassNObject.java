// CLASS is a blueprint for creating objects, it defines properties and behaviour that the object will have.
// OBJECT is a instance of the class, meaning it is a concrete representation of the blueprint.
// Eg : imagine a bakery as a class, the bakery makes different types cakes(object), but all cakes have properties(flavour, weight, price) and behaviour(baking and icing)

//blueprint
class Bakery {
    // Properties (Fields / Attributes)
    String flavour;
    double weight;
    double price;

    // Constructor
    Bakery(String flavour, double weight, double price) {
        this.flavour = flavour;
        this.weight = weight;
        this.price = price;
    }

    // Behavior 1: Baking
    void bake() {
        System.out.println("Baking a " + flavour + " cake...");
    }

    // Behavior 2: Icing
    void ice() {
        System.out.println("Adding icing to the " + flavour + " cake.");
    }

    // Display Cake details
    void dispalyDetails() {
        System.out.println("Cake Details: Flavour = " + flavour + ", Weight = " + weight + ", price = " + price);
    }
}
public class ClassNObject {
    public static void main(String[] args) {
        // Creating Cake objects (Instances)
        Bakery vanillaCake = new  Bakery("Vanilla", 1.5, 500);
        Bakery mangoCake = new  Bakery("Mango", 2.0, 700);

        // Using object behaviors
        vanillaCake.bake();
        vanillaCake.ice();
        vanillaCake.dispalyDetails();

        System.out.println("--------------");

        mangoCake.bake();;
        mangoCake.ice();
        mangoCake.dispalyDetails();
    }
    
}