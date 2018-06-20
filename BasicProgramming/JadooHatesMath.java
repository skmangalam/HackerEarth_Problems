package BasicProgramming;

import java.util.Scanner;

public class JadooHatesMath {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for(int i=1; i<=11; i++) {
            if ((num + i) % 3 != 0 && check(String.valueOf(num + i)))
            {System.out.println(num + i);
                break;}
        }
    }

    public static boolean check(String num){

        char[] array = num.toCharArray();
        for(int i=0; i<array.length; i++){
            if(array[i]=='3')
                return false;
        }
        return true;
    }

}
