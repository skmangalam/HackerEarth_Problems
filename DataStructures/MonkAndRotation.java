package DataStructures;

import java.io.*;
import java.util.Arrays;

import Utility.Reader;

public class MonkAndRotation {
    public static void main(String[] args) throws IOException{
        Reader input = new Reader();
        BufferedOutputStream out=new BufferedOutputStream(System.out);
        StringBuilder sb=new StringBuilder();

        int test = input.nextInt();

        while(test-- >0){

            int N = input.nextInt();
            int K = input.nextInt();
            K = K%N;
            int[] array1 = new int[N];
            for(int i=0; i<N; i++)
                array1[i] = input.nextInt();

            int[] copy1 = Arrays.copyOfRange(array1,N-K,N);
            int[] copy2 = Arrays.copyOfRange(array1,0,N-K);

            int j=0;
            //System.out.println("copy1");
            for(int i:copy1){
                array1[j++] = i;

                //System.out.println(i);
            }
            //System.out.println("copy2");
            for(int i:copy2){
                array1[j++] = i;
                //System.out.println(i);
            }

            for(int i:array1)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
