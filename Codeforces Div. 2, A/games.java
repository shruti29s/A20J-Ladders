/*      Problem statement : https://codeforces.com/problemset/problem/268/A */

import java.util.*;
import java.io.*;

public class games {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h[]=new int[n];
        int a[]=new int[n];
        int ch[]=new int[101];
        int ca[]=new int[101];
        for(int i=0;i<n;i++)
        {
            h[i]=sc.nextInt();
            ch[h[i]]++;
            a[i]=sc.nextInt();
            ca[a[i]]++;
        }
        int s=0;
        for(int i=0;i<n;i++)
        {
            s+=ch[h[i]]*ca[h[i]];
            ch[h[i]]=0;
        }
        System.out.println(s);
    }
}
