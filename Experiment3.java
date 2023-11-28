public class Experiment3 {

    // Write a Program to arrange elements in array ascending order
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
    // WAP to find second largest in array
    public static int secondLargest(int[] arr) {
        int largest=0,second=0;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != largest ) second = Math.max(second, arr[i]);
        }
        return second;
    }

    // WAP to find sum of all elements in an array
    public static void sumInArr(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of the elements:"+sum);
    }
    // WAP to print all the duplicate elements in array
    public static void checkDuplicates(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) { 
                    System.out.print(arr[i]+" ");
                }        
            }
        }
    }

    public static void main(String[] args) {
        // System.out.println(secondLargest(new int[]{1,2,3,4,5}));
        // int arr[] = new int[]{2, 5, 7, 3, 5, 2, 7};
        // checkDuplicates(arr);
        bubbleSort(new int[]{2,5,6,1,7});
    }
}
