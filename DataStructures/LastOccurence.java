package DataStructures;

import java.io.*;
import Utility.Reader;
public class LastOccurence {

    public static void main(String[] args)throws Exception {

        Reader input = new Reader();

        BufferedOutputStream out=new BufferedOutputStream(System.out);
        StringBuilder sb=new StringBuilder();

        //Scanner input = new Scanner(System.in);

        int test = input.nextInt();

        while(test -- >0){

            int size = input.nextInt();

            int[] array = new int[1000001];

            for(int i=0; i<size; i++){

                array[input.nextInt()] = i + 1;

            }
            int queries = input.nextInt();
            for(int i=0;i<queries; i++){

                int num = input.nextInt();

                if(num>1000000)
                    sb.append("-1\n");
                else
                    sb.append(array[num]==0?"-1\n":array[num]+"\n");

            }
        }
        out.write(sb.toString().getBytes());
        out.flush();
    }
}
