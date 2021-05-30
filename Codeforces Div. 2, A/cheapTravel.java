/*      Problem statement : https://codeforces.com/problemset/problem/466/A */

import java.util.*;
import java.io.*;

public class cheapTravel {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(m>n)
        {
            if(a*n<=b)
                System.out.println(a*n);
            else
                System.out.println(b);
        }
        else{
            if(a*m<=b)
            {
                System.out.println(a*n);
            }
            else{
                int x=n/m;
                int r=n%m;
                if(r*a<=b)
                {
                    System.out.println((x*b)+(r*a));
                }
                else{
                    System.out.println(x*b+b);
                }
            }
        }
    }
}
