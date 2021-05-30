/*      Problem statement : https://codeforces.com/problemset/problem/459/A */

import java.util.*;
import java.io.*;

public class PashmakAndGarden {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3, x4, y3, y4;
        if(x1==x2 && y1==y2)
        {
            System.out.println(-1);
        }
        else if(x1==x2)
        {
            int d=Math.abs(y1-y2);
            x3=x1+d;
            x4=x1+d;
            y3=y1;
            y4=y2;
            System.out.println(x3+" "+y3+" "+x4+" "+y4);
        }
        else if(y1==y2)
        {
            int d=Math.abs(x1-x2);
            y3=y1+d;
            y4=y1+d;
            x3=x1;
            x4=x2;
            System.out.println(x3+" "+y3+" "+x4+" "+y4);
        }
        else if(Math.abs(x1-x2)==Math.abs(y1-y2))
        {
            x3=x1;
            y3=y2;
            x4=x2;
            y4=y1;
            System.out.println(x3+" "+y3+" "+x4+" "+y4);
        }
        else{
            System.out.println(-1);
        }
    }
}
