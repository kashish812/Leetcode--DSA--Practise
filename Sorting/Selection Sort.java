class Solution {
    void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i =n-1;i>0;i--){
            int maxIndex = i;
            for(int j =0;j<i;j++){
                if(arr[j]>arr[maxIndex]){
                   maxIndex= j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
             arr[maxIndex] = temp;
        }
      
        
    }
}
