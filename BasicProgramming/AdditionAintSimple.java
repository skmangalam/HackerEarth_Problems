package BasicProgramming;

import java.util.Scanner;

public class AdditionAintSimple {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int test = input.nextInt();

        while (test-- > 0){

            String str = input.next();

            StringBuilder str1 = new StringBuilder();

            //System.out.println(addition('l','l'));
            for(int i=0; i<str.length(); i++){

                str1.append(addition(str.charAt(i), str.charAt(str.length()-i-1)));
            }

            System.out.println(str1.toString());
        }
    }

    public static char addition(char x, char y){
        //System.out.print(x+"_"+y+" ");
        int a = x-96;
        int b = y-96;
        int c = (a + b)-26 + 96;
        return (char) c;
    }
}
