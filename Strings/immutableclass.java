package Strings;

//CREATE YOUR OWN IMMUTABLE CLASS

final class immutableclass {
    private int i;

    immutableclass(int i) {
        this.i = i;
    }
    public immutableclass modify(int i) {
        if(this.i == i) {
            return this;
        } else {
            return new immutableclass(i);
        }
    }

    public static void main(String[] args) {
        immutableclass t1 = new immutableclass(10);
        immutableclass t2 = t1.modify(100);
        immutableclass t3 = t1.modify(10);

        System.out.println(t1==t2);
        System.out.println(t1==t3);

    }
}
