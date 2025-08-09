package leetcode;
/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).



Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
 */
public class medianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int m = nums1.length;
        int n = nums2.length;
        int low = 0, high = m;
        while(low<=high){
            int i =(low+high)/2;
            int j = (m+n+1)/2-i;
            int maxLeftA = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int minRightA = (i == m) ? Integer.MAX_VALUE : nums1[i];
            int maxLeftB = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int minRightB = (j == n) ? Integer.MAX_VALUE : nums2[j];

            if(maxLeftA <= minRightB && maxLeftB <= minRightA) {
                if((m + n) % 2 == 0) {
                    return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;
                }else{
                    return Math.max(maxLeftA, maxLeftB);
                }
            }else if(maxLeftA > minRightB) {
                high = i - 1;
            }else{
                low = i + 1;
            }

        }
        return 0.0;
    }

    public static void main(String[] args) {
        medianOfTwoSortedArray mid = new medianOfTwoSortedArray();
        System.out.println(mid.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }
}
