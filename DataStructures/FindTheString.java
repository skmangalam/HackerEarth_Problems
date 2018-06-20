package DataStructures;

import java.util.Scanner;

public class FindTheString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        int i;
        while(test-- >0){

            int N = input.nextInt();
            int M = input.nextInt();
            int[][] array = new int[N][26];

            for(i=0; i<N; i++){

                String str = input.next();

                for(int j=0; j< M; j++){
                    int num = str.charAt(j) - 97;
                    array[i][num]++;
                }


            }

            String str1 = input.next();

            for(i=0; i<str1.length(); i++){
                if(array[i%N][str1.charAt(i)-97]==0)
                {
                    System.out.println("No");
                    break;
                }
                else{
                    array[i%N][str1.charAt(i)-97]--;
                }
            }
            if(i==str1.length()){
                System.out.println("Yes");
            }
        }
    }
}
