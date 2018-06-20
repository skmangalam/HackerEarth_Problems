package DataStructures;

import java.io.BufferedOutputStream;
import java.io.IOException;
import Utility.Reader;

public class MemorizeMe {

    public static void main(String[] args) throws IOException{
        Reader input = new Reader();
        BufferedOutputStream out=new BufferedOutputStream(System.out);
        StringBuilder sb=new StringBuilder();
        int N = input.nextInt();

        int[] array = new int[1001];

        for(int i=0; i<N; i++){
            array[input.nextInt()]++;
        }
        int queries = input.nextInt();
        for(int i=0; i<queries; i++){
            int num = input.nextInt();
            if(num>1000)
                sb.append("NOT PRESENT\n");
            else
                sb.append(array[num]!=0?array[num]+"\n":"NOT PRESENT\n");
        }
        out.write(sb.toString().getBytes());
        out.flush();
    }
}
