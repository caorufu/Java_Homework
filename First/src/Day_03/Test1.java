package Day_03;

public class Test1 {
    public static void main(String[] args)
    {
        for(int i = 0 , i1 = 10 ;i<5; i ++ , i1++)
        {
            if(i>1 && i<5)
                System.out.println(i);System.out.println(i1);
        }

        int a=-5,b=0;
        if(!(a%2==0))
            b=--a;
        System.out.println(b);
    }
}
