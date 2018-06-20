package BasicProgramming;

import Utility.Reader;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class PrintHackerEarth {

    public static void main(String[] args) throws IOException {

        Reader input = new Reader();
        BufferedOutputStream out = new BufferedOutputStream(System.out);
        StringBuilder sb = new StringBuilder();

        int size = input.nextInt();
        int[] array = new int[7];
        String str = input.readLine();

        for(int i=0; i<str.length(); i++){
            int value = str.charAt(i);
            if(value==97)
                array[0]++;
            else if(value==99)
                array[1]++;
            else if(value==101)
                array[2]++;
            else if(value==104)
                array[3]++;
            else if(value==107)
                array[4]++;
            else if(value==114)
                array[5]++;
            else if(value==116)
                array[6]++;
        }
        array[0] /= 2;
        array[2] /= 2;
        array[3] /= 2;
        array[5] /= 2;
        Arrays.sort(array);
        System.out.println(array[0]);
    }

}
