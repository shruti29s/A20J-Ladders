/*      Problem statement : https://codeforces.com/problemset/problem/330/A */

import java.util.*;
import java.io.*;

public class Cakeminator {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        String a[]=new String[r];
        for(int i=0;i<r;i++){
            a[i]=sc.next();
        }
        int r1=0, c1=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            {
                if(a[i].charAt(j)=='S')
                {
                    r1++;
                    break;
                }
            }
        }
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                if(a[j].charAt(i)=='S')
                {
                    c1++;
                    break;
                }
            }
        }
        int ans=(r*c)-(r1*c1);
        System.out.println(ans);
    }
}
