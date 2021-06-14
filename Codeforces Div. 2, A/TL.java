/*      Problem statement : https://codeforces.com/problemset/problem/350/A */

import java.util.*;
import java.io.*;

public class TL {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        if(a[n-1]>=b[0])
        {
            System.out.println(-1);
        }
        else{
            int x=2*a[0];
            if(x<b[0])
            {
                if(a[n-1]>=x)
                {
                    System.out.println(a[n-1]);
                }
                else{
                    System.out.println(x);
                }
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
