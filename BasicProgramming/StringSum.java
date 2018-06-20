package BasicProgramming;

import java.io.*;

public class StringSum {
    public static void main(String[] args) throws IOException {
        Reader input = new Reader();
        String str = input.readLine();
        char[] array = str.toCharArray();
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum = sum + (int)array[i] - 96;
        }
        System.out.println(sum);
    }
}
