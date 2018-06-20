package BasicProgramming;

import java.io.BufferedOutputStream;
import java.io.IOException;

public class Mystery{
    public static void main(String[] args) {
        Reader input = new Reader();
        StringBuilder sb = new StringBuilder();
        BufferedOutputStream out = new BufferedOutputStream(System.out);
        loop:for(int i=0;i>-1;i++){
            try {
                int num = input.nextInt();
                //System.out.println(num);
                sb.append(countSetBits(num)+"\n");
            }
            catch (Exception e){
                //out.write(sb.toString().getBytes());
                //out.flush();
                System.out.println(sb);
                System.out.println("exception");
                break loop;
            }
        }
    }
    public static long countSetBits(long num){
        long total=0;
        while(num!=0){
            num = num&(num-1);
            total++;
        }
        return total;
    }
}