package CoreJava;

public class mthdString {
    public static void main(String[] args) {
        //STRING CONCATENATION
        //1 : no obj is assigned
        String s = new String("Pra");
        s.concat("tham");
        System.out.println(s); //Pra
        //2 : after assigning obj
        String name = s.concat("tham");
        System.out.println(name); //Pratham
        //3 : using + operator
        System.out.println(s + "tham");

        System.out.println("------------");
        //STRINGBUILDER & STRINGBUFFER
        //Can be modified directly
        StringBuilder sb = new StringBuilder("Prat");
        sb.append("ham");
        System.out.println(sb); //Pratham

        System.out.println("-------------");
        //equals method with String : content comparison
        String s1 = new String("Pra");
        String s2 = new String("Pra");
        System.out.println(s1.equals(s2)); //true

        System.out.println("-------------");
        //equals method with StringBuffer and StringBuilder : reference comparison
        StringBuffer sb1 = new StringBuffer("Pra");
        StringBuffer sb2 = new StringBuffer("Pra");
        System.out.println(sb1.equals(sb2)); //false
 
    }
}
