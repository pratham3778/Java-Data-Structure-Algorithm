package String;

public class ReverseString {

    //approch 1 : using StringBuilder
    public static String rev(String n) {
        StringBuilder sb = new StringBuilder();
        for(int i=n.length()-1;i>=0;i--) {
            char c = n.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }

    //approch 2 : using a new String
    static String reveString(String n) {
        String revStr = "";

        for(int i = n.length()-1; i>=0;i--) {
            revStr = revStr+n.charAt(i);
        }
        return revStr;
    }

    //approch 3 : using inbuilt function
    static void reversed(String n) {
        StringBuffer sb = new StringBuffer(n);
        System.out.println(sb); //normal str
        sb.reverse();
        System.out.println(sb); //rev str
    }

    
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String n = "PRATHAM TANPURE";
        System.out.println(rev(n));
        System.out.println(reveString(n));
        reversed(n);
    }
}
