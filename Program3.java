import java.util.*;

public class Program3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int k=(a%2==0)?a-1:a;
        for (int i=0;i<k;i++) {
            int odd=2*i+1;
            System.out.print(odd);
            if (i<k-1) System.out.print(", ");
        }
    }
}
