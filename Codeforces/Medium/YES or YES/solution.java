import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- !=0)
        {
            
        String s=sc.next();
        s=s.toLowerCase();
        System.out.println(s.equals("yes")?"YES":"NO");
        }

        
    }
}