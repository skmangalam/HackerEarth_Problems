package BasicProgramming;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class MagicalTree {
    public static void main(String args[] ) throws Exception {

        //BufferedReader
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int value=0;
        while(num-- >0){

            String str = input.next();
            int value1=0;
            StringTokenizer tokenizer = new StringTokenizer(str, "+-", true);
            if(tokenizer.hasMoreTokens())
            value1= Integer.valueOf(tokenizer.nextToken());

            while(tokenizer.hasMoreTokens()){

                //value1 = value1 + Integer.valueOf(tokenizer.nextToken());
               if(tokenizer.nextToken().charAt(0)=='+'){
                   value1 = value1 + Integer.valueOf(tokenizer.nextToken());
               }
               else
                   value1 = value1 - Integer.valueOf(tokenizer.nextToken());
            }
            if(value1>value)
                value = value1;
        }
        System.out.println(value);
    }
}
