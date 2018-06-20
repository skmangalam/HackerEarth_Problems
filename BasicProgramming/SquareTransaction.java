package BasicProgramming;

import java.io.*;
import java.util.Arrays;

public class SquareTransaction{

    public static void main(String[] args) throws IOException{

        Reader input = new Reader();
        BufferedOutputStream out=new BufferedOutputStream(System.out);
        StringBuilder sb=new StringBuilder();

        int size = input.nextInt();

        int[] array = new int[size];
        long[] sum = new long[size+1];

        for(int i=0; i< size; i++){
            array[i] = input.nextInt();
            if(i==0)
                sum[i] = array[i];
            else
                sum[i] = sum[i-1] + array[i];
        }
        int query = input.nextInt();

        for(int i=0; i< query; i++){

            long target = input.nextInt();

            Arrays.sort(sum);

            int pos = Arrays.binarySearch(sum, target);

            if(sum[size]<target)
                sb.append("-1\n");

            else if(pos < 0)
            {
                sum[0] = target;
                Arrays.sort(sum);
                sb.append(Arrays.binarySearch(sum,target)+1+"\n");
            }

            else{
                sb.append(pos+"\n");
            }

        }

        out.write(sb.toString().getBytes());
        out.flush();
    }

}


