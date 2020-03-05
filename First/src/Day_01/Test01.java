package Day_01;

public class Test01 {
    public static void main(String[] args)
    {
        String[] s = new String[10];
        s[0] = "善学如春起之苗";
        s[1] = "不见其增，日有所长";
        s[2] = "假学如磨刀之石";
        s[3] = "不见其损，年有所亏";
        s[4] = "加油吧！少年";
        s[5] = "J";
        s[6] = "A";
        s[7] = "V";
        s[8] = "A";
        s[9] = "!";
        for(int i = 0 ; i <10 ; i++)
            System.out.println(s[i]);

        for(int i = 0 ; i <5; i++)
            System.out.println(i);

        for(float i = 0.1f ; i <5.1 ; i++)
            System.out.println(i);

        Boolean a = true , b = false ;
        System.out.println(a);
        System.out.println(b);

        swap(100 , 200);

    }
    static void swap(int a , int b)
    {
        int temp = 0 ;
        temp = a ; a = b ; b = temp ;
        System.out.println(a);
        System.out.println(b);

    }

}
