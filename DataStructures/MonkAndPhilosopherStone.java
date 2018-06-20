package DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class MonkAndPhilosopherStone {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int size = input.nextInt();
        int[] array = new int[size];

        for(int i=0; i<size; i++){
            array[i] = input.nextInt();
        }

        int query = input.nextInt();

        long sum = input.nextInt();

        int count = 0;

        int res = 0;

        for(int i=0; i<query; i++){

            String q = input.next();

            if(q.charAt(0)=='H') {

                stack.push(array[count]);
                res = res + stack.peek();
                count++;
                if(res == sum)
                    System.out.println(stack.size());
            }

            else
            {
                res = res - stack.pop();
            }

        }

    }
}
