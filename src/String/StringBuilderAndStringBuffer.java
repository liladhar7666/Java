package String;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {

        String r1 = new String("nilya");
        System.out.println(r1);
        r1 = r1.concat("meshram");
        System.out.println(r1);

        String s2 = new String("hello jan");
        System.out.println(s2);
        String s3 = s2;
        System.out.println(s3);

        StringBuffer sb = new StringBuffer("abcd");
        System.out.println(sb);
        sb = sb.append("wow");
        System.out.println(sb);


        StringBuilder bu=new StringBuilder("sdsdd");
        System.out.println(bu);


        String p1 = "hello";
        String p2 = p1.concat("world");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);

        StringBuffer ps = new StringBuffer("raj");
        StringBuffer lm =ps.append("meshram");
        System.out.println(ps==lm);

    }
}
