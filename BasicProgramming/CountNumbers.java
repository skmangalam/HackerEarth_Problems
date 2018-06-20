package BasicProgramming;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test=input.nextInt();
        while(test-->0){
            int size = input.nextInt();
            String str = input.next();
            int count=0;
            int flag=0;
            for(int i=0; i<size; i++){
                if(str.charAt(i)>=48&&str.charAt(i)<=57){
                    if(flag==0)
                    {
                        count++;
                        flag=1;
                    }
                }
                else
                    flag=0;
            }
            System.out.println(count);
        }
    }
}
