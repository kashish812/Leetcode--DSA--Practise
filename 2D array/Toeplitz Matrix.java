## Question

Given a matrix, check whether it is a **Toeplitz Matrix** or not.

A matrix is Toeplitz if every diagonal from **top-left to bottom-right** contains the same elements.

Example:

```text
1  2  3  4
5  1  2  3
6  5  1  2
7  6  5  1
```

Here, every diagonal has the same elements, so it is a Toeplitz Matrix.

---

## Java Code

```java
class Solution {
    public boolean isToeplitzMatrix(int[][] arr) {

        for (int i = 1; i < arr.length; i++) {

            for (int j = 1; j < arr[0].length; j++) {

                if (arr[i][j] != arr[i - 1][j - 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}
```

## Logic

Hum har element ko uske **upper-left element** se compare karte hain.

```text
Current element → arr[i][j]

Upper-left     → arr[i-1][j-1]
```

Agar dono different hain, matrix Toeplitz nahi hai.

```java
if (arr[i][j] != arr[i - 1][j - 1])
```

Isliye:

```java
return false;
```

### `i` aur `j` 1 se kyun start kiye?

Humein `i - 1` aur `j - 1` use karna hai.

Agar `i = 0` ya `j = 0` se start karenge, toh index `-1` ho jayega.

Isliye:

```text
i = 1
j = 1
```

se start karte hain.

### Loop kaise chalega?

Maan lo:

```text
1  2  3
4  1  2
5  4  1
```

Pehle:

```text
i = 1
j = 1

arr[1][1] vs arr[0][0]

1 vs 1 → same
```

Phir `j++`:

```text
i = 1
j = 2

arr[1][2] vs arr[0][1]

2 vs 2 → same
```

Phir inner loop complete hone ke baad `i++`:

```text
i = 2
j = 1

arr[2][1] vs arr[1][0]

4 vs 4 → same
```

Aur aise saare elements check hote hain.

## Interview Explanation

**"First, I start both loops from index 1 because I need to compare every element with its upper-left element. For each element, I compare `arr[i][j]` with `arr[i-1][j-1]`. If they are different, it means the diagonal elements are not the same, so I immediately return false. If all the elements pass the comparison and the loops finish completely, I return true, which means the matrix is a Toeplitz Matrix."**

## Why `return false` inside the `if`?

Because **one mismatch is enough** to prove that the matrix is not Toeplitz.

```text
One mismatch → false
All comparisons same → true
```

## Why `return true` is outside the loops?

Because `true` tabhi return karna hai jab **saare possible cases check ho jaayein** and kisi bhi case mein mismatch na mile.

## Complexity

**Time Complexity:** `O(m × n)`

We check almost every element of the matrix once.

**Space Complexity:** `O(1)`

We don't use any extra array or data structure.
