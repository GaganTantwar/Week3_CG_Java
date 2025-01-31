package heapsort;

import java.util.*;
public class HeapSort {
    static void heapify(int salary[], int n, int i) {

        // Initialize largest as root
        int largest = i;

        // left index = 2*i + 1
        int l = 2 * i + 1;

        // right index = 2*i + 2
        int r = 2 * i + 2;

        // If left child is larger than root
        if (l < n && salary[l] > salary[largest]) {
            largest = l;
        }

        // If right child is larger than largest so far
        if (r < n && salary[r] >salary[largest]) {
            largest = r;
        }

        // If largest is not root
        if (largest != i) {
            int temp = salary[i];
            salary[i] = salary[largest];
            salary[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(salary, n, largest);
        }
    }

    // Main function to do heap sort

    static void heapSorting(int salary[]) {
        int n = salary.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salary, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {

            // Move current root to end
            int temp = salary[0];
            salary[0] = salary[i];
            salary[i] = temp;

            // Call max heapify on the reduced heap
            heapify(salary, i, 0);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the Array: ");
        int size=sc.nextInt();
        int []salary=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter Salary  in Array: ");
            salary[i]=sc.nextInt();
        }
        heapSorting(salary);
        System.out.println("Sorted Salary : "+ Arrays.toString( salary));
    }
}
