// Package declaration
package stackandqueue.stockspan;

import java.util.*;

// Class representing the StockSpan problem
public class StockSpan {

    // Method to calculate the stock span
    public static int[] calculateSpan(int prices[], int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        st.push(0);
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            while ((!st.empty()) && prices[st.peek()] <= prices[i]) {
                st.pop();
            }
            ans[i] = (st.empty()) ? (i + 1) : (i - st.peek());
            st.push(i);
        }
        return ans;
    }

    // Method to display the stock span
    public static void displaySpan(int[] answer) {
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    // Main method to test the StockSpan class
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size ");
        int size = sc.nextInt();
        int[] prices = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter price for " + (i + 1) + " day");
            prices[i] = sc.nextInt();
        }
        int[] answer = calculateSpan(prices, size);
        displaySpan(answer);
    }
}
