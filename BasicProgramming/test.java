package BasicProgramming;

import java.util.Scanner;
import java.util.StringTokenizer;

public class test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long test = input.nextLong();

        while (test-- > 0) {

            long l = input.nextLong();
            long h = input.nextLong();

            long count = 0;

            for (long i = l; i <= h; i++) {
                String str = Long.toBinaryString(i);
                int len = str.length();
                StringTokenizer stringTokenizer = new StringTokenizer(str, "0");
                int tokens = stringTokenizer.countTokens();
                int firstTokenLength=0;
                if(stringTokenizer.hasMoreTokens())
                    firstTokenLength = stringTokenizer.nextToken().length();
                if (firstTokenLength==len) {
                    count++;
                }
                else if (len % 2 == 0 && tokens == len / 2)
                    count++;
                else if (thirdType(stringTokenizer, firstTokenLength))
                    count++;
            }
            System.out.println(count+1);
        }
    }

        public static boolean thirdType(StringTokenizer str, int size){
        int flag=1;

        while (str.hasMoreTokens()){
            if(str.nextToken().length()!=size+1){
                flag = 0;
                break;
            }

            else
                size++;
        }
        if(flag==1)
            return true;
        else
            return false;
    }

}
