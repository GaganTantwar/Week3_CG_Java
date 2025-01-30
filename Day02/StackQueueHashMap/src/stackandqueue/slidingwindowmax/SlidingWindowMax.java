package stackandqueue.slidingwindowmax;
import java.util.*;
public class SlidingWindowMax {
    public static int[] maxSlidingWindow(int[] nums, int k) {
            if (nums == null || nums.length == 0) return new int[0];

            int n = nums.length;
            int[] result = new int[n - k + 1];
            Deque<Integer> deque = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                // Remove elements that are out of this window
                if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                    deque.pollFirst();
                }

                // Remove elements smaller than the current element from the back of the deque
                while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                    deque.pollLast();
                }

                // Add the current index
                deque.offerLast(i);

                // The first element in deque is the max of the window
                if (i >= k - 1) {
                    result[i - k + 1] = nums[deque.peekFirst()];
                }
            }

            return result;
        }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size ");
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter Value in the array:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Window Size: ");
        int k=sc.nextInt();
        int res[]=maxSlidingWindow(arr,k);
        for(int i=0;i<res.length;i++){
            System.out.println("Maximum in Window: "+(i+1)+" "+res[i]);
        }
    }

}


