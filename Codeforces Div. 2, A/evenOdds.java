/*      Problem statement : https://codeforces.com/problemset/problem/318/A */

import java.util.*;
import java.io.*;

public class evenOdds {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        long mid=n/2;
        if(n%2!=0)
        {
            mid=mid+1;
        }
        if(k<=mid)
        {
            System.out.println(2*k-1);
        }
        else{
            System.out.println(2*(k-mid));
        }
    }
}
