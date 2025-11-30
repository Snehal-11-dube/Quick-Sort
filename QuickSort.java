package dsa;
import java.util.Scanner;

public class QuickSort
{
    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1; //returning pivot;
    }

    public static void quicksort(int arr[], int low, int high)
    {
        if(low < high)
        {
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of elements to sort: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter elements to sort: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        quicksort(arr,0, n-1);
        System.out.println("Sorted array:");
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
}