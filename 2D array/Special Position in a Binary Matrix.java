# Special Positions in a Binary Matrix

## Question

You are given a binary matrix `arr` where each element is either `0` or `1`.

A position `(i, j)` is called a **special position** if:

* `arr[i][j] == 1`
* There is no other `1` in the same row.
* There is no other `1` in the same column.

Return the number of special positions in the matrix.

---

## Java Code

```java
class Solution {
    public int numSpecial(int[][] arr) {

        int Count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == 1) {

                    int rowCount = 0;
                    int colCount = 0;

                    // Check the row
                    for (int k = 0; k < arr[0].length; k++) {
                        if (arr[i][k] == 1) {
                            rowCount++;
                        }
                    }

                    // Check the column
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k][j] == 1) {
                            colCount++;
                        }
                    }

                    if (rowCount == 1 && colCount == 1) {
                        Count++;
                    }
                }
            }
        }

        return Count;
    }
}
```

---

# Logic

Sabse pehle hum matrix ke **har element** ko check karte hain.

```java
if (arr[i][j] == 1)
```

Agar `1` mila, tab hum uski:

1. **Row check** karte hain.
2. **Column check** karte hain.

### Row Check

```java
for (int k = 0; k < arr[0].length; k++)
```

Yahan `i` same rahega aur `k` column ko change karega.

```text
arr[i][k]
```

Isse hum us poori row mein `1` count karte hain.

Agar:

```text
rowCount == 1
```

toh us row mein sirf wahi `1` hai.

### Column Check

```java
for (int k = 0; k < arr.length; k++)
```

Yahan `j` same rahega aur `k` row ko change karega.

```text
arr[k][j]
```

Isse hum us poori column mein `1` count karte hain.

Agar:

```text
colCount == 1
```

toh us column mein bhi sirf wahi `1` hai.

### Final Condition

```java
if (rowCount == 1 && colCount == 1)
```

Dono conditions true hain → position **special** hai.

Isliye:

```java
Count++;
```

---

# Example

```text
1  0  0
0  0  1
0  1  0
```

### `(0,0)`

Row:

```text
1 0 0
```

Only one `1` ✅

Column:

```text
1
0
0
```

Only one `1` ✅

So `(0,0)` is special.

Same process baaki `1`s ke liye bhi hoga.

Answer:

```text
3
```

---

# Interview Explanation

**"First, I traverse every element of the matrix using nested loops. Whenever I find a `1`, I check its complete row and complete column. I use `rowCount` to count the number of ones in that row and `colCount` to count the number of ones in that column. If both counts are equal to one, then that position is a special position, so I increment the answer. Finally, I return the total count."**

---

# Interview Questions

### 1. What is a special position?

**Answer:**

A position is special if its value is `1` and there is no other `1` in the same row or column.

---

### 2. Why do you check `arr[i][j] == 1` first?

**Answer:**

Because only a position containing `1` can be a special position. There is no need to check the row and column for a `0`.

---

### 3. Why do you use `rowCount`?

**Answer:**

`rowCount` tells us how many `1`s are present in the current row. For a special position, it must be exactly `1`.

---

### 4. Why do you use `colCount`?

**Answer:**

`colCount` tells us how many `1`s are present in the current column. For a special position, it must also be exactly `1`.

---

### 5. Why is the condition `rowCount == 1 && colCount == 1`?

**Answer:**

Because the current position itself contains one `1`. We need to make sure there are no other `1`s in its row or column.

---

### 6. What does `arr[i][k]` mean?

**Answer:**

Here `i` is fixed, so we stay in the same row, while `k` changes the column.

---

### 7. What does `arr[k][j]` mean?

**Answer:**

Here `j` is fixed, so we stay in the same column, while `k` changes the row.

---

### 8. What is the time complexity?

**Answer:**

**O(m × n × (m + n))**

Because we visit every matrix element, and for every `1`, we scan its complete row and column.

---

### 9. What is the space complexity?

**Answer:**

**O(1)**

Because we only use a few variables like `Count`, `rowCount`, and `colCount`; no extra array is used.

---

### 10. Can this solution be optimized?

**Answer:**

Yes. We can first calculate the number of `1`s in every row and column and then check each position in another traversal. That can reduce the time complexity to **O(m × n)**, but it requires extra space for row and column count arrays.

---

# Important Index Concept

```text
i → Row
j → Column
```

For checking the current row:

```text
arr[i][k]
```

For checking the current column:

```text
arr[k][j]
```

**Ye `i` aur `j` wala concept 2D-array questions mein bahut important hai.**
