//Abstraction means hiding the internal implementation and exposing only the essential features of an object

// eg : It's like using a mobile phone — you press buttons, but don’t know the internal working of circuits.

abstract class Mobile {
    abstract void makeCall();

    void powerOn() {
        System.out.println("Phone is Powered on");
    }
}

class Smartphone extends Mobile {
    @Override
    void makeCall() {
        System.out.println("Calling via 4G network");
    }
}
public class Abstraction {
    public static void main(String[] args) {
    Mobile m = new Smartphone();

    m.powerOn();
    m.makeCall();
    }
}
