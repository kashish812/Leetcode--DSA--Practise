class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            while(i>0 && i<nums1.length && nums1[i]==nums1[i-1]){
                i++;
            }
            while(j>0 &&j<nums2.length&& nums2[j]==nums2[j-1]){
                j++;
            }
            if (i == nums1.length || j == nums2.length) {
    break;
}


            if(nums1[i]==nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        int[] result = new int[ans.size()];

        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }

        return result;
    }
}
