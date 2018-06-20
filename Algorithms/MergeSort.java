package Algorithms;

import java.util.Scanner;

public class MergeSort {
    static int count=0;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] array = new int[N];
        for(int i=0; i<N; i++)
            array[i] = input.nextInt();

        mergeSort(array,0,N-1);

        System.out.println(count);

    }
    public static void mergeSort(int[] array, int start, int end){

        if(start<end){
            int mid = (start+end)/2;
            mergeSort(array, start, mid);
            mergeSort(array, mid+1, end);
            merge(array, start, mid, end);
        }

    }
    public static void merge(int[] array, int start, int mid, int end){

        int p = start;
        int q = mid + 1;
        int Arr[] = new int[end+1-start];
        int k=0;
        for(int i=start; i<=end; i++){
            if(p>mid)
                Arr[k++] = array[q++];
            else if(q>end){
                Arr[k++] = array[p++];
                count = count + (mid-i);
            }
            else if(array[p]<array[q])
                Arr[k++] = array[p++];
            else{
                Arr[k++] = array[q++];
                count = count + (mid-i);
            }

        }
        for(int i=0; i<k; i++){
            array[start++] = Arr[i];
        }

    }
}
