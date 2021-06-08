/*      Problem statement : https://codeforces.com/problemset/problem/233/A */

import java.util.*;
import java.io.*;

public class PerfectPermutations {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p[]=new int[n];
        if(n%2!=0)
        {
            System.out.println(-1);
        }
        else{
            for(int i=1;i<=n;i++)
            {
                if(i%2==0)
                {
                    p[i-1]=i-1;
                }
                else{
                    p[i-1]=i+1;
                }
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(p[i]+" ");
            }
        }
    }
}
