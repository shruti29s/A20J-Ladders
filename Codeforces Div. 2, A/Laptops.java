/*      Problem statement : https://codeforces.com/problemset/problem/456/A */

import java.util.*;
import java.io.*;

public class Laptops {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        Pair arr[]=new Pair[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=new Pair(a[i], b[i]);
        }
        Arrays.sort(arr, new MyCmp());
        int f=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i].y>arr[i+1].y)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("Happy Alex");
        }
        else{
            System.out.println("Poor Alex");
        }
    }
}

class Pair{
    int x, y;
    Pair(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
}
 
class MyCmp implements Comparator<Pair>
{
    public int compare(Pair p1, Pair p2)
    {
        return p1.x-p2.x;
    }
}