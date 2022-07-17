//http://usaco.org/index.php?page=viewproblem2&cpid=665

import java.util.*;
import java.io.*;

public class Cowsignal {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(new File("cowsignal.in"));
    int M=in.nextInt();
    int N=in.nextInt();
    int K=in.nextInt();
    
    char[][] sig=new char[M][N];
    for(int i=0;i<M;i++){
        sig[i]=in.next().toCharArray();
    }
    in.close();

    PrintWriter out = new PrintWriter(new File("cowsignal.out"));
    for(int i=0;i<M;i++){
        int count=0;
        while (count<K){
            out.println(line(sig[i],K,N));
            count++;
        }
    }
    
    out.close();
  }
  
  public static char[] line(char[]sig,int K,int N){
      char[] ret = new char[sig.length*K];
      int index=0;
      for(int j=0;j<N;j++){
          int count=0;
          while (count<K){
              ret[index]=sig[j];
              index++;
              count++;
          }
      }
      return ret;
  }
}
