/*      Problem statement : https://codeforces.com/problemset/problem/479/A */

import java.util.*;
import java.io.*;

public class expressions {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a==1 && b==1 && c==1) ||(a==1 && c==1))
        {
            System.out.println(a+b+c);
        }
        else if((a==1 && b==1) || a==1)
        {
            System.out.println((a+b)*c);
        }
        else if((b==1 && c==1) || c==1)
        {
            System.out.println(a*(b+c));
        }
        else if(b==1)
        {
            System.out.println((Math.min(a,c)+b)*Math.max(a,c));
        }
        else{
            System.out.println(a*b*c);
        }
    }
}
