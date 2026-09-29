## Maximum Wealth — LeetCode

### Java Solution

```java
class Solution {
    public int maximumWealth(int[][] accounts) {

        int[] ans = new int[accounts.length];

        // Calculate the wealth of each customer
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }

            ans[i] = sum;
        }

        // Find the maximum wealth
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] > max) {
                max = ans[i];
            }
        }

        return max;
    }
}
```

### Interview Explanation

**"First, I create an integer array `ans` to store the total wealth of each customer. Then, I use a nested loop to calculate the sum of all bank accounts for each customer. After calculating the complete sum of a row, I store it in the `ans` array. Finally, I traverse the `ans` array and find the maximum value, which represents the maximum wealth of a customer. Then, I return that maximum value."**

### Why is `ans[i] = sum` outside the inner loop?

**"Because the inner loop calculates the complete wealth of one customer. So, after the inner loop finishes, I store the final sum in `ans[i]`."**

### Complexity

* **Time Complexity:** `O(m × n)`

  * We visit every element of the 2D array once.

* **Space Complexity:** `O(m)`

  * The `ans` array stores the total wealth of each customer.

### Key Concept

For each row:

```text
Customer 0 → account 1 + account 2 + account 3 → total wealth
Customer 1 → account 1 + account 2 + account 3 → total wealth
Customer 2 → account 1 + account 2 + account 3 → total wealth
```

Then we find the **maximum total wealth** among all customers.
