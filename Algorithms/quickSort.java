package Algorithms;

public class quickSort {
    public static void main(String[] args) {

        int[] array = {1,-4,10,5,-89,9,95};

        quickSort(array,0,array.length-1);

        for(int i=0; i<array.length; i++)
            System.out.println(array[i]);

    }

    public static void quickSort(int[] array, int low, int high){
        if(low<high){

            int p = partition(array, low, high);

            quickSort(array, low, p-1);
            quickSort(array, p+1, high);
        }
    }
    public static int partition(int [] array, int low, int high){
        int pivot = array[high];
        int i=low-1;
        for(int j=low; j<high; j++){
            if(Math.abs(array[j])<=Math.abs(pivot)){
                i++;
                int a = array[i];
                array[i] = array[j];
                array[j] = a;
            }
        }
        int b = array[i+1];
        array[i+1] = pivot;
        array[high] = b;
        return i+1;
    }

}
