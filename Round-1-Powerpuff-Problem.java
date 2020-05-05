
import java.io.*;
import java.util.*;
import java.util.Arrays;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {
   Scanner sc = new Scanner(System.in);
   int n =sc.nextInt();
   long ar[] = new long[n];
   for(int i=0;i<n;i++)
      ar[i]=sc.nextLong();
   for(int i=0;i<n;i++)
      ar[i]=(sc.nextLong()/ar[i]);
   Arrays.sort(ar);
   System.out.println(ar[0]);
   }
}
