package Day_02;

public class Day_02 {
    public static void main(String[] args) {
        byte b1, b2;
        short s1, s2;
        char c1;
        int i1;
        b1 =5;
        b2 =(byte)30-5;
        s1 =20;
        s2 =(short)3000-20;
        c1 ='a';
        i1 =c1 -67;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(c1);
        System.out.println(i1);

        int t1=100;
        double d1=0.0001;
        d1+=t1;
        t1+=d1;
        System.out.println(d1);
        System.out.println(t1);

        String ch = "JAVA";

        System.out.println(ch.toLowerCase());

        int a = 21;

        if(a%2==0)
            System.out.println("Hello");
    }
}
