class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int i = 0;                  // Left Pointer
        int j = nums.length - 1;    // Right Pointer

        while (i < j) {

            // Case 1:
            // Left = Odd ❌
            // Right = Even ✅
            // Dono galat side par hain.
            // Isliye Swap karo.
            if (nums[i] % 2 == 1 && nums[j] % 2 == 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;    // Left ab sahi ho gaya
                j--;    // Right bhi sahi ho gaya
            }

            // Case 2:
            // Left already Even hai.
            // Ye apni correct position par hai.
            // Bas aage badho.
            else if (nums[i] % 2 == 0) {
                i++;
            }

            // Case 3:
            // Right already Odd hai.
            // Ye apni correct position par hai.
            // Bas peeche aao.
            else {
                j--;
            }
        }

        return nums;
    }
}
