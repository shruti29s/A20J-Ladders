/*      Problem statement : https://codeforces.com/problemset/problem/265/A */

import java.util.*;
import java.io.*;

public class ColourfulStones {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int j=0, i=0;
        while(i<t.length() && j<s.length())
        {
            if(t.charAt(i)==s.charAt(j))
            {
                j++;
            }
            i++;
        }
        System.out.println(j+1);
    }
}
