package DataStructures;

import java.util.Scanner;

public class BinaryQueries{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int Q = input.nextInt();

        int[] array = new int[N];

        for(int i=0; i<N; i++)
            array[i] = input.nextInt();

        while(Q-- > 0){

            int num = input.nextInt();

            if(num==0){
                int L = input.nextInt();
                int R = input.nextInt();
                if(array[R-1]==1)
                    System.out.println("ODD");
                else
                    System.out.println("EVEN");
            }
            else {

                int pos = input.nextInt();
                array[pos-1]= ~array[pos-1];
            }
        }

    }
}
