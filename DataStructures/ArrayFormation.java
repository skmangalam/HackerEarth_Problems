package DataStructures;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class ArrayFormation {
    static {
        int n = 1000001;
        boolean[] prime = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        /*for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.print(i + " ");
        }*/



    }

    static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        System.out.println(prime[100]);
        int n = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().split(" ");
        int[] A = new int[n];

        for(int i_A=0; i_A<arr_A.length; i_A++)
        {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }

        int[][] out_ = queue_and_stack(A);
        for(int i_out_=0; i_out_<out_.length; i_out_++)
        {
            System.out.print(out_[i_out_][0]);
            for(int j_out_=1; j_out_<out_[i_out_].length; j_out_++)
            {
                System.out.print(" " + out_[i_out_][j_out_]);
            }
            System.out.println("");
        }

        wr.close();
        br.close();
    }

    static int[][] queue_and_stack(int[] A){

        int[][] a = new int[2][A.length];

        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        Queue<Integer> q1 = new LinkedList<>();

        int j=0;
        for(int i=0; i<A.length; i++){
            if(isPrime(A[i])){
                q1.add(A[i]);
                //a[0][j++] = A[i];
            }
            else
                s1.push(A[i]);
        }
        int size1 = q1.size();
        int size2 = s1.size();
        a[0] = new int[size1];
        a[1] = new int[size2];
        for(j=0; j<size1;j++){
            a[0][j] = q1.remove();
        }
        j=0;
        while(!s1.isEmpty()){
            int b = s1.pop();
            a[1][j++] = b;
            s2.push(b);
        }

        return a;

    }

    public static boolean isPrime(int a){

        if(a==2)
            return true;

        for(int i=2; i<=Math.sqrt(a);i++){

            if(a%i==0)
                return false;

        }
        return true;
    }


}