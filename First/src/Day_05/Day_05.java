package Day_05;

public class Day_05 {
    public static void main(String[] args)
    {
        int[] a = new int[10];
        for(int i=0; i<10;i++)
        {
            a[i] = i;
            System.out.println(a[i]);
        }
        String[] Huase = {"黑桃","红桃","方片","梅花"};
        char[] dian  = new char[13];
        for(int i=0 ; i<13;i++)
            dian[i] = (char)('A'+i);
        for(int j=0;j<4;j++)
        {
            for (int i = 0; i < 13; i++)
                System.out.print(Huase[j] + dian[i] + ' ');
            System.out.println();
        }
    }
}
