/*      Problem statement : https://codeforces.com/problemset/problem/432/A */

import java.util.*;
import java.io.*;

public class ChoosingTeam {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]+k<=5)
            {
                c++;
            }
        }
        System.out.println(c/3);
    }
}
