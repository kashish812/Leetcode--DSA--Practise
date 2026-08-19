class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int index1 = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                index1 = mid;
                right = mid-1;

            }
            else if(arr[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }

        }
        left = 0;
        right = n-1;
        int index2= -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
               index2 =mid;
                left = mid+1;
            }
            else if(arr[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return new int[]{index1,index2};

        
    }
}
