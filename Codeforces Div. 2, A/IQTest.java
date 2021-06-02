/*      Problem statement : https://codeforces.com/problemset/problem/25/A */

import java.util.*;
import java.io.*;

public class IQTest {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int o=0, e=0;
        int l=0, m=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                l=i;
                e++;
            }
            else{
                m=i;
                o++;
            }
        }
        if(o==1)
        {
            System.out.println(m+1);
        }
        else{
            System.out.println(l+1);
        }
    }
}
