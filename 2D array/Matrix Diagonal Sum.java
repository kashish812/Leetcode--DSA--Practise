## Java Code

```java
class Solution {
    public int diagonalSum(int[][] arr) {

        int[] arr2 = new int[arr.length];

        // Store primary diagonal elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (i == j) {
                    arr2[i] = arr[i][j];
                }
            }
        }

        int[] arr3 = new int[arr.length];

        // Store secondary diagonal elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (i + j == arr.length - 1) {
                    arr3[i] = arr[i][j];
                }
            }
        }

        int sum = 0;

        // Add primary diagonal elements
        for (int i = 0; i < arr2.length; i++) {
            sum = sum + arr2[i];
        }

        // Add secondary diagonal elements
        for (int i = 0; i < arr3.length; i++) {
            sum = sum + arr3[i];
        }

        // Remove the middle element if it was counted twice
        if (arr.length % 2 != 0) {
            int middle = arr.length / 2;
            sum = sum - arr[middle][middle];
        }

        return sum;
    }
}
```

## Interview Explanation

**"First, I create an array `arr2` to store the primary diagonal elements. I use nested loops and check `i == j`. If the condition is true, I store that element in `arr2`."**

**"Then, I create another array `arr3` to store the secondary diagonal elements. For the secondary diagonal, I check `i + j == arr.length - 1` and store those elements in `arr3`."**

**"After that, I calculate the sum of both diagonal arrays using two separate loops."**

**"If the matrix size is odd, the middle element is present in both diagonals, so it gets counted twice. Therefore, I subtract the middle element once."**

**"Finally, I return the diagonal sum."**

## Important Conditions

### Primary diagonal

```java
if (i == j)
```

Example:

```text
1  2  3
4  5  6
7  8  9
```

Primary diagonal:

```text
1, 5, 9
```

### Secondary diagonal

```java
if (i + j == arr.length - 1)
```

Secondary diagonal:

```text
3, 5, 7
```

### Middle element

```java
int middle = arr.length / 2;
```

For a `3 × 3` matrix:

```text
middle = 3 / 2 = 1
```

So middle element is:

```java
arr[1][1]
```

## Complexity

**Time Complexity:** `O(n²)`

Because we use nested loops multiple times to traverse the matrix.

**Space Complexity:** `O(n)`

Because we create `arr2` and `arr3`, each of size `n`.
