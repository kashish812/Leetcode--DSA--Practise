// LeetCode 26 - Remove Duplicates from Sorted Array

// Approach:
// Two Pointer

// Time Complexity: O(n)
// Space Complexity: O(1)

// Interview Points:
// 1. Array must be sorted.
// 2. i traverses the array.
// 3. j stores the next unique element.
// 4. Compare nums[i] with nums[i-1].
// 5. If different -> copy and j++.
// 6. Return j.

class Solution {
    public int removeDuplicates(int[] nums) {

        int j = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}
