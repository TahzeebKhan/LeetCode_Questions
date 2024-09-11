class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i = 0, j = 0;
        double median;

        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                arr.add(nums1[i]);
                i++;
            }
            else if(nums1[i]>nums2[j]){
                arr.add(nums2[j]);
                j++;
            }
        }

        while(i<m){
            arr.add(nums1[i]);
                i++;
        }
        
        while(j<n){
            arr.add(nums2[j]);
                j++;
        }
        int length = m+n;
        
            if(length%2!=0){
                median = arr.get(((length+1)/2)-1);
            }
            else{
                double first = arr.get(((length/2))-1);
                double Second = arr.get(((length/2)+1)-1);

                median = (first + Second ) /2;
            }

        return median;
    }
}