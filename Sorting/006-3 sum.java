class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // Step 1: Array ko sort karo
        // Sorting se left++ aur right-- karna possible hota hai
        Arrays.sort(nums);

        // Saare valid triplets yahan store honge
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;

        // Step 2: Ek element fix karo
        // i ke baad kam se kam 2 elements bachne chahiye
        for (int i = 0; i < n - 2; i++) {

            // Same value ko dobara fixed element mat banao
            // Warna same triplet duplicate aa sakta hai
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Step 3: Baaki 2 numbers ke liye two pointers
            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                // Fixed + left + right = 3 numbers ka sum
                int sum = nums[i] + nums[left] + nums[right];

                // Sum 0 mila → valid triplet mil gaya
                if (sum == 0) {

                    result.add(Arrays.asList(
                        nums[i], nums[left], nums[right]
                    ));

                    // Same elements ko dobara check mat karo
                    left++;
                    right--;

                    // Left side ke duplicate skip karo
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Right side ke duplicate skip karo
                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }
                }

                // Sum negative hai → sum ko bada karna hai
                // Sorted array me left aage karne se number bada hoga
                else if (sum < 0) {
                    left++;
                }

                // Sum positive hai → sum ko chhota karna hai
                // Right peeche karne se number chhota hoga
                else {
                    right--;
                }
            }
        }

        // Saare valid triplets return karo
        return result;
    }
}
