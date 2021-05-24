/*      Problem statement : https://codeforces.com/problemset/problem/71/A  */

import java.util.*;
import java.io.*;
class wayTooLongWord{
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            String str=sc.next();
            int l=str.length();
            if(l>10)
            {
                System.out.print(str.charAt(0));
                System.out.print(l-2);
                System.out.println(str.charAt(l-1));
            }
            else{
                System.out.println(str);
            }
        }
    }
}