/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[] ) throws Exception {
      int m = sc.nextInt();
      while(m!=0)
      {
         int n = sc.nextInt();
         pow(n);
         m--;
      }
   }
   public static void pow(int n)
   {
      int count=0,v=0;
      int ar[]=new int[n];
      int br[]=new int[n];
      for(int i=0;i<n;i++)
         ar[i]=sc.nextInt();
      for(int i=0;i<n;i++)
         br[i]=sc.nextInt();
      Arrays.sort(ar);
      Arrays.sort(br);
      for(int i=0;i<n;i++)
      {
         for(int j=v;j<n;j++)
         {
            if(br[j]<ar[i])
            {
               count++;
               ar[i]=0;
               br[j]=0;
               v=j+1;
               break;
            }
         }
      }
      System.out.println(count);
   }
}
